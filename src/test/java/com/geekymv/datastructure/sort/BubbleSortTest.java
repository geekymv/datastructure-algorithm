package com.geekymv.datastructure.sort;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void testSort() {
        int[] arr = {4, 6, 3, 5, 2, 1};
        System.out.println("排序前：" + Arrays.toString(arr));

        BubbleSort sort = new BubbleSort();
        sort.sort(arr);
    }

}
