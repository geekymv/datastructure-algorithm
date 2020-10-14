package com.geekymv.datastructure.linkedlist;

import org.junit.Test;

public class DoubleLinkedListTest {


    @Test
    public void test() {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.list();

        System.out.println("--------------------");
        linkedList.remove(2);
        linkedList.list();

        System.out.println("--------------------");
        Integer item = linkedList.get(0);
        System.out.println(item);
    }

}
