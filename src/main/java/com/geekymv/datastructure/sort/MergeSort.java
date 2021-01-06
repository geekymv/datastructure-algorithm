package com.geekymv.datastructure.sort;


/**
 * arr[p, r] = arr[p, q] + arr[q+1, r]
 *
 */
public class MergeSort {

    public void sort(int[] arr) {
        int length = arr.length;

        mergeSort(arr, 0, length-1);
    }


    private void mergeSort(int[] arr, int p, int r) {
        // 递归终止条件
        if(p >= r) {
            return;
        }

        // 取p、r 中间的位置
        int q = (p + r) / 2;

        // 分治递归
        mergeSort(arr, p, q);
        mergeSort(arr, q+1, r);

        // 合并数据
        merge(arr, p, q, r);
    }


    /**
     * arr[p, r] = arr[p, q] + arr[q+1, r]
     * @param arr
     * @param p 第一个数组的起始下标
     * @param q 第一个数组的终止下标
     * @param r 第二个数组的终止下标
     */
    public void merge(int arr[], int p, int q, int r) {
        int[] temp = new int[r-p+1]; // 申请一个和arr[p, r] 长度一样的数组
        int k = 0; // 指向临时数组的起始位置
        int i = p; // 指向第一个数组的起始位置
        int j = q+1; // 指向第二个数组的起始位置

        // 把 arr[p, q] 和 arr[q+1, r] 中较小的数添加到temp中
        while(i <=q && j <= r) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }

        // 将左边剩余的数据拷贝到temp
        while (i <= q) {
            temp[k++] = arr[i++];
        }
        // 将右边剩余的数据拷贝到temp
        while (j <= r) {
            temp[k++] = arr[j++];
        }

        // 将temp 数组中的数据拷贝到arr
        for(int m = 0, len = temp.length; m < len; m++) {
            arr[p+m] = temp[m];
        }
    }

}
