package com.geekymv.datastructure.stack;

import com.geekymv.datastructure.statck.ArrayStack;
import org.junit.Test;

public class ArrayStackTest {


    @Test
    public void test() {
        ArrayStack<Integer> arrayStack = new ArrayStack(3);

        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);

        arrayStack.list();
        System.out.println("---------------------------");

        Integer item = arrayStack.pop();
        System.out.println("item = " + item);
        arrayStack.list();
    }




}
