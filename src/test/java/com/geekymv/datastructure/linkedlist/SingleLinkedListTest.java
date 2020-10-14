package com.geekymv.datastructure.linkedlist;

import org.junit.Test;

public class SingleLinkedListTest {

    @Test
    public void test() {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.list();

        System.out.println("--------------------");

        SingleLinkedList reverse = linkedList.reverse();
        linkedList.list();
        System.out.println("--------------------");
        reverse.list();

    }

}
