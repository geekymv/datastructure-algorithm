package com.geekymv.datastructure.statck;

public class ArrayStack {

    private Integer[] items;

    private final int stackSize;

    private int top;

    public ArrayStack(int stackSize) {
        this.stackSize = stackSize;
        items = new Integer[stackSize];
    }

    public boolean push(Integer item) {
        if(top == stackSize) {
            System.out.println("栈已满");
            return false;
        }
        items[top++] = item;

        return true;
    }

    public Integer pop() {
        if(top == 0) {
            System.out.println("栈为空");
            return null;
        }
        return items[--top];
    }


    public void list() {
        for(int i = top-1; i >=0; i--) {
            System.out.println(items[i]);
        }
    }

}
