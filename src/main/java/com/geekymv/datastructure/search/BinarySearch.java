package com.geekymv.datastructure.search;

public class BinarySearch {

    public int binarySearch(int[] a, int target) {
        int i = 0, j = a.length-1; // i 和 j 分别指向第1个元素和最后一个元素
        while(i <= j) { // i == j  的时候需要继续循环，否则会缺少一次比较
            int m = (i + j) / 2; // 当数组元素非常多的时候，这里可能会溢出
            // int m = (i + j) >>> 1; // 无符号右移1位
            if (target == a[m]) {
                // 找到了
                return m;
            }
            else if (target < a[m]) {
                j = m - 1;
            }
            else {
                i = m + 1;
            }
        }
        // 没有找到
        return -1;
    }
}
