package com.geekymv.datastructure.sort;

public class MergeArray {


    public int[] merge(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;

        int[] c = new int[lenA + lenB];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < lenA && j < lenB) {
            if(a[i] <= b[j]) {
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }

        while (i < lenA) {
            c[k++] = a[i++];
        }
        while (j < lenB) {
            c[k++] = b[j++];
        }

        return c;
    }

}
