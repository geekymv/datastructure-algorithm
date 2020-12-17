package com.geekymv.datastructure.sort;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void testSort() {
        int[] arr = {4, 6, 3, 5, 2, 1};
        System.out.println("排序前：" + Arrays.toString(arr));

        InsertionSort sort = new InsertionSort();
        sort.sort(arr);

        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
