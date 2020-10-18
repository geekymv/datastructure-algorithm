package com.geekymv.datastructure.linkedlist;

/**
 * 单向循环链表
 */
public class SingleCycleLinkedList {

    // 头结点
    private Node head;

    public SingleCycleLinkedList() {
        head = new Node();
        // 初始化时头结点的next指向自身
        head.next = head;
    }

    public boolean add(Integer item) {
        // 新创建一个结点
        Node newNode = new Node(item, null);

        // 找到尾结点
        Node tmp = head;
        while (tmp.next != head) {
            tmp = tmp.next;
        }

        // 这个时候tmp指向尾结点（即tmp.next = head），新结点的next指向head。
        newNode.next = tmp.next;
        tmp.next = newNode;

        return true;
    }

    public void list() {
        Node tmp = head;
        while (tmp.next != head) {
            tmp = tmp.next;
            System.out.println(tmp.item);
        }
    }

    private static class Node {

        private Integer item;

        private Node next;

        public Node() {
        }

        public Node(Integer item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

}
