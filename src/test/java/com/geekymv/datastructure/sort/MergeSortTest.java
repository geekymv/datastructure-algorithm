package com.geekymv.datastructure.sort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    public void testSort() {
        int[] arr = {4, 6, 3, 5, 2, 1};
        System.out.println("排序前：" + Arrays.toString(arr));

        MergeSort sort = new MergeSort();
        sort.sort(arr);

        System.out.println("排序后：" + Arrays.toString(arr));
    }

}
