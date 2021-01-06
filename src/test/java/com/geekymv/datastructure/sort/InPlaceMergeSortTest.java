package com.geekymv.datastructure.sort;

import org.junit.Test;

import java.util.Arrays;

public class InPlaceMergeSortTest {

    @Test
    public void testSort() {
        int[] arr = {4, 6, 3, 5, 2, 1};
//        int[] arr = {3, 4, 6, 1, 2, 5};
        System.out.println("排序前：" + Arrays.toString(arr));

        InPlaceMergeSort sort = new InPlaceMergeSort();
        sort.sort(arr, 0, (0 + arr.length-1)/2, arr.length-1);

        System.out.println("排序后：" + Arrays.toString(arr));
    }

}
