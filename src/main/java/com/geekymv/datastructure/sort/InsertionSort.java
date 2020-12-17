package com.geekymv.datastructure.sort;

public class InsertionSort {

    public void sort(int[] arr) {
        int len = arr.length;
        if(len <= 1) {
            return;
        }

        for(int i = 1; i < len; i++) { // 未排序区间
            int item = arr[i]; // 待排序元素

            int j = i-1;
            for(;j >= 0; j--) { // 已排序区间
                if(arr[j] <= item) {
                    break;
                } else {
                    arr[j+1] = arr[j]; // 已排序区间元素后移
                }
            }

            // 待排序元素的位置
            arr[j+1] = item;
        }
    }

}
