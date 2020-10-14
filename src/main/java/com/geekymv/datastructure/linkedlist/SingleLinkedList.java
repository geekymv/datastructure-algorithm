package com.geekymv.datastructure.linkedlist;

public class SingleLinkedList {

    // 头结点
    private Node head;

    // 链表中实际元素个数
    private int size;

    public SingleLinkedList() {
        this.head = new Node();
        this.size = 0;
    }


    public boolean addFirst(Integer item) {
        Node newNode = new Node(item, null);
        // tmp 指向头结点
        Node tmp = head;
        newNode.next = tmp.next;
        tmp.next = newNode;

        return true;
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
        size++;

        return true;
    }

    /**
     * 在指定的索引上插入元素
     * @param index 从0开始
     * @param item
     * @return
     */
    public boolean add(int index, Integer item) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
        Node newNode = new Node(item, null);

        Node tmp = head;
        // 找到指定索引的前一个索引的结点
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        // 指定索引位置上原来的结点
        Node node = tmp.next;

        tmp.next = newNode;
        newNode.next = node;
        size++;

        return true;
    }

    /**
     * 返回指定位置的元素
     * @param index
     * @return
     */
    public Integer get(int index) {
        this.checkIndex(index);

        Node node = this.node(index);
        return node.item;
    }

    /**
     * 删除指定索引位置的结点
     * @param index
     * @return
     */
    public Integer remove(int index) {
        this.checkIndex(index);
        // 找到要删除结点的前一个结点
        Node tmp = head;
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        // 待删除的结点
        Node node = tmp.next;
        // 前一个结点的指针域指向带删除结点的后一个结点
        tmp.next = node.next;

        size--;

        Integer val = node.item;
        node.item = null;

        return val;
    }


    /**
     * 修改指定位置结点的值
     * @param index
     * @param item
     * @return
     */
    public Integer set(int index, Integer item) {
        this.checkIndex(index);
        Node node = this.node(index);
        Integer oldVal = node.item;
        // 替换为新值
        node.item = item;

        return oldVal;
    }

    /**
     * 查找链表中倒数第k个结点元素
     * @param k
     * @return
     */
    public Integer findFromLast(int k) {
        int index = size - k;
        return this.get(index);
    }

    /**
     * 单链表的反转
     */
    public SingleLinkedList reverse() {
        SingleLinkedList linkedList = new SingleLinkedList();
        // 遍历待反转的链表，将结点依次添加到新链表
        Node tmp = head;
        while (tmp.next != null) {
            linkedList.addFirst(tmp.next.item);
            tmp = tmp.next;
        }
        return linkedList;
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

    /**
     * 返回链表元素个数
     * @return
     */
    public int size() {
        return size;
    }

    Node node(int index) {
        Node tmp = head;
        for(int i = 0; i <= index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
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
