package com.geekymv.datastructure.search;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    @DisplayName("binarySearch 找到")
    public void testBinarySearch() {
        int[] a = {1, 6, 10, 18, 22, 35};

        BinarySearch bs = new BinarySearch();
        assertEquals(0, bs.binarySearch(a, 1));
        assertEquals(1, bs.binarySearch(a, 6));
        assertEquals(2, bs.binarySearch(a, 10));
        assertEquals(3, bs.binarySearch(a, 18));
        assertEquals(4, bs.binarySearch(a, 22));
        assertEquals(5, bs.binarySearch(a, 35));
    }

    @Test
    @DisplayName("binarySearch 没找到")
    public void testBinarySearchNotFound() {
        int[] a = {1, 6, 10, 18, 22, 35};

        BinarySearch bs = new BinarySearch();
        assertEquals(-1, bs.binarySearch(a, -5));
        assertEquals(-1, bs.binarySearch(a, 2));
        assertEquals(-1, bs.binarySearch(a, 8));
        assertEquals(-1, bs.binarySearch(a, 15));
        assertEquals(-1, bs.binarySearch(a, 24));
        assertEquals(-1, bs.binarySearch(a, 38));
    }

    @Test
    public void testIntOverflow() {

        int i = 0;
        int j = Integer.MAX_VALUE - 1;
        int m = (i + j) / 2;


        i = m + 1;
        m = (i + j) / 2; // i + j 超过了 int 最大值
        System.out.println(m);

        m = (j - i) / 2 + i;
        System.out.println(m);

        // 同一个二进制数
        // 不把最高位看作符号位 和 把最高位看作符号位
        // 对于二进制都是同一个数
        m = (i + j) >>> 1;
        System.out.println(m);
    }
}
