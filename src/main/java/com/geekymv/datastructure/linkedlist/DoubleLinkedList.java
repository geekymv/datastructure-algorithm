package com.geekymv.datastructure.linkedlist;

public class DoubleLinkedList {

    // 头结点
    private Node head;

    // 链表中实际元素个数
    private int size;

    public DoubleLinkedList() {
        this.head = new Node();
        this.size = 0;
    }

    /**
     * 在链表尾部插入元素
     * @param item
     * @return
     */
    public boolean add(Integer item) {
        Node newNode = new Node(item, null);
        // tmp 指向头结点
        Node tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
        newNode.prev = tmp;
        size++;

        return true;
    }


    /**
     * 删除指定索引位置的结点
     * @param index
     * @return
     */
    public Integer remove(int index) {
        this.checkIndex(index);
        // 找到要删除的结点
        Node tmp = head.next;
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        Integer val = tmp.item;
        tmp.item = null;

        tmp.prev.next = tmp.next;
        if(tmp.next != null) {
            tmp.next.prev = tmp.prev;
        }

        tmp.next = null;
        tmp.prev = null;

        size--;

        return val;
    }


    /**
     * 遍历元素
     */
    public void list() {
        Node tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
            System.out.println(tmp.item);
        }
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
    }


    private static class Node {

        private Integer item;

        private Node next;

        private Node prev;

        public Node() {
        }

        public Node(Integer item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
