package com.geekymv.datastructure.recursion;

import java.math.BigInteger;

public class FactorialFor {

    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.valueOf(n);
        if(n <= 1) {
            return BigInteger.ONE;
        }

        for(int i = 1; i < n; i++) {
            result = result.multiply(BigInteger.valueOf(n -i));
        }

        return result;
    }


}
