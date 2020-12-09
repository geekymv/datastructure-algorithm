package com.geekymv.datastructure.recursion;

import org.junit.Test;

import java.math.BigInteger;

public class FactorialTest {

    @Test
    public void testFactorial() {

        Factorial f = new Factorial();
        BigInteger result = f.factorial(10000);

        System.out.println(result);
    }

}
