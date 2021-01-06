package com.geekymv.datastructure.sort;

import java.util.Arrays;

/**
 * 原地归并排序
 */
public class InPlaceMergeSort {

    /**
     * 将一个左右两半分别有序的数组合并成一个完整的有序数组
     * 比如 arr[low, mid] 有序，arr[mid+1, high] 有序
     * 将arr[low, mid] 和 arr[mid+1, high] 合并之后还是有序的数组
     * @param arr
     * @param low
     * @param mid
     * @param high
     */
    public void sort(int[] arr, int low, int mid, int high) {

        int[] aux = new int[high-low+1];
        // 将arr[low, high] 复制到 aux[low, high]
        for(int k = low; k <= high; k++) {
            aux[k] = arr[k];
        }
        System.out.println(Arrays.toString(aux));

        // 将arr[low, mid] 和 arr[mid+1, high] 归并
        int i = low;
        int j = mid+1;
        for(int k = low; k <= high; k++ ) {
            if(i > mid) { // 左半部分取完了，取右半部分
                arr[k] = aux[j++];
            }else if(j > high) { // 右半部分取完了，取左半部分
                arr[k] = aux[i++];

            } else if(aux[i] < aux[j]) { // 左半部分的元素比右半部分元素小，取左半部分
                arr[k] = aux[i++];
            } else { // 否则取右半部分
                arr[k] = aux[j++];
            }
        }
    }



}
