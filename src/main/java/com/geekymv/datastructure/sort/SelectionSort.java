package com.geekymv.datastructure.sort;

public class SelectionSort {

    public void sort(int[] arr) {
        int len = arr.length;
        if(len <= 1) {
            return;
        }

        for(int i = 0; i < len-1; i++) {
            // 最小元素索引，初始化为未排序区间的第一个元素
            int index = i;

            // 从未排序区间找到最小元素索引
            for(int j = i+1; j < len; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }

            // 将未排序区间的最小元素和未排序区间的第一个元素交换，最小元素追加到已排序区间的尾部
            swap(arr, i, index);
        }
    }

    /**
     * 交换元素
     * @param arr
     * @param i
     * @param j
     */
    public void swap(int[] arr, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
