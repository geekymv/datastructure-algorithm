package com.geekymv.datastructure.statck;

public class ArrayStack<T> {

    private Object[] items;

    private final int stackSize;

    private int top;

    public ArrayStack(int stackSize) {
        this.stackSize = stackSize;
        items = new Object[stackSize];
    }

    public boolean push(Object item) {
        if(top == stackSize) {
            System.out.println("栈已满");
            return false;
        }
        items[top++] = item;

        return true;
    }

    public T pop() {
        if(top == 0) {
            System.out.println("栈为空");
            return null;
        }
        return (T)items[--top];
    }

    /**
     * 返回栈顶元素
     * @return
     */
    public T peek() {
        if(top == 0) {
            System.out.println("栈为空");
            return null;
        }
        return (T)items[top-1];
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty() {
        return top == 0;
    }


    public void list() {
        for(int i = top-1; i >=0; i--) {
            System.out.println(items[i]);
        }
    }

}
