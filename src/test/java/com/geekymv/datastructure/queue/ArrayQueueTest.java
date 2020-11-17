package com.geekymv.datastructure.queue;

import org.junit.Test;

public class ArrayQueueTest {

    @Test
    public void test() {

        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.list();
    }

}
