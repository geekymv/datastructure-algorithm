package com.geekymv.datastructure.sort;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void testSort() {
        int[] arr = {6, 4, 7, 3, 2, 5, 1};
        System.out.println(Arrays.toString(arr));

        BubbleSort sort = new BubbleSort();
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
