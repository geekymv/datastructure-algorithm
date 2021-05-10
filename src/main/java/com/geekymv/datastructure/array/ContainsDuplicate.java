package com.geekymv.datastructure.array;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * 判断数组元素是否重复
 */
public class ContainsDuplicate {

    public boolean containsDuplicateV1(int[] nums) {
        final int len = nums.length;
        if(len < 2) {
            return false;
        }

        for(int i = 0; i < len; i++) {
            for(int j = i+1; j < len; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean containsDuplicateV2(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        final int len = nums.length;
        if(len < 2) {
            return false;
        }

        for(int i = 0; i < len; i++) {
            if(!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

}
