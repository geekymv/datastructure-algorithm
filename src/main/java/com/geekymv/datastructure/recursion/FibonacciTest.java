package com.geekymv.datastructure.recursion;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        Fibonacci f = new Fibonacci();
        int res = f.fibonacci(6);

        System.out.println(res);
    }

}
