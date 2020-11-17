package com.geekymv.datastructure.queue;

public class ArrayQueue {

    private Integer[] items;

    private int size;

    private int head = 0;

    private int tail = 0;

    public ArrayQueue(int size) {
        this.size = size;
        items = new Integer[size];
    }

    /**
     * 入队列
     * @param item
     * @return
     */
    public boolean enqueue(int item) {
        // 判断队列是否已满
        if(tail == size) {
            return false;
        }
        items[tail] = item;
        tail++;
        return true;
    }

    /**
     * 出队列
     * @return
     */
    public Integer dequeue() {
        // 判断队列是否为空
        if(head == tail) {
            return null;
        }
        Integer item = items[head];
        head++;

        return item;
    }

    /**
     * 打印队列中所有元素
     */
    public void list() {
        for(int i = head; i < tail; i++) {
            System.out.println(items[i]);
        }
    }

}
