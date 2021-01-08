package com.geekymv.datastructure.sort;

public class MergeArray {


    public int[] merge(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;

        // 定义一个数组c[] 用于存储合并结果，长度为数组a的长度 + 数组b的长度
        int[] c = new int[lenA + lenB];
        int i = 0; // 指向数组a[]的起始下标
        int j = 0; // 指向数组b[]的起始下标
        int k = 0; // 指向数组c[]的起始下标

        // 遍历数组a[] 和 数组b[] 比较元素大小，并将比较结果放入数组c[] 中
        while (i < lenA && j < lenB) {
            if(a[i] <= b[j]) {
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }

        // 数组a[] 有剩余
        while (i < lenA) {
            c[k++] = a[i++];
        }
        // 数组b[] 有剩余
        while (j < lenB) {
            c[k++] = b[j++];
        }

        return c;
    }

}
