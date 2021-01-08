package com.geekymv.datastructure.sort;

import org.junit.Test;

import java.util.Arrays;

public class MergeArrayTest {

    @Test
    public void test() {
        int[] a = {4, 6 };
        int[] b = {1, 2, 3, 5};

        MergeArray mergeArray = new MergeArray();
        int[] c = mergeArray.merge(a, b);

        System.out.println(Arrays.toString(c));

    }


}
