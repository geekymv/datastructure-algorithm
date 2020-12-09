package com.geekymv.datastructure.recursion;

import org.junit.Test;

import java.math.BigInteger;

public class FactorialForTest {

    @Test
    public void testFactorial() {

        FactorialFor f = new FactorialFor();
        BigInteger result = f.factorial(5);

        System.out.println(result);
    }
}
