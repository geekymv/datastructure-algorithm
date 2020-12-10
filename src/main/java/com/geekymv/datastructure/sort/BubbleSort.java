package com.geekymv.datastructure.sort;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len-1; i++) {
            System.out.print("第" + (i+1) + "次冒泡");
            // 是否交换的标识位，用于提前结束冒泡
            boolean flag = false;
            for(int j = 0; j < len-1 - i; j++) { // 参与冒泡的元素索引
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    flag = true;
                }
            }

            System.out.println(Arrays.toString(arr));

            if(!flag) {
                break;
            }
        }

        System.out.println("排序后：" + Arrays.toString(arr));
    }

    /**
     * 交换元素
     * @param arr
     * @param i
     * @param j
     */
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
