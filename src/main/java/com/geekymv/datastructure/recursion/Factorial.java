package com.geekymv.datastructure.recursion;

import java.math.BigInteger;

public class Factorial {

    public BigInteger factorial(int n) {
        if(n <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }


}
