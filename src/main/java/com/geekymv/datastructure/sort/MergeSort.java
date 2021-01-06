package com.geekymv.datastructure.sort;


/**
 * arr[start, end] = arr[start, mid] + arr[mid+1, end]
 *
 */
public class MergeSort {

    public void sort(int[] arr) {
        int length = arr.length;

        mergeSort(arr, 0, length-1);
    }


    private void mergeSort(int[] arr, int start, int end) {
        // 递归终止条件
        if(start >= end) {
            return;
        }

        // 取start、end 中间的位置
        int mid = (start + end) / 2;

        // 分治递归
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        // 合并数据
        merge(arr, start, mid, end);
    }


    /**
     * arr[start, end] = arr[start, mid] + arr[mid+1, end]
     * @param arr
     * @param start 左边数组的起始下标
     * @param mid 左边数组的终止下标
     * @param end 右边数组的终止下标
     */
    public void merge(int arr[], int start, int mid, int end) {
        int[] temp = new int[end-start+1]; // 申请一个和arr[p, r] 长度一样的数组
        int k = 0; // 指向临时数组的起始下标
        int i = start; // 指向左边数组的起始下标
        int j = mid+1; // 指向右边数组的起始下标

        // 把 arr[start, mid] 和 arr[mid+1, end] 中较小的数添加到temp中
        while(i <=mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }

        // 将左边剩余的数据拷贝到temp
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // 将右边剩余的数据拷贝到temp
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // 将temp 数组中的数据拷贝到arr
        for(int m = 0, len = temp.length; m < len; m++) {
            arr[start+m] = temp[m];
        }
    }

}
