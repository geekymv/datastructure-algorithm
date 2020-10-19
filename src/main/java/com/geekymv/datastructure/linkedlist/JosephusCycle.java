package com.geekymv.datastructure.linkedlist;

/**
 * 约瑟夫环问题
 * https://www.jianshu.com/p/e1079f486851
 */
public class JosephusCycle {

    // 指向第一个结点
    private Node first;

    // 指向最后一个结点
    private Node last;

    public boolean add(Integer item) {
        // 新创建一个结点
        Node newNode = new Node(item, null);

        // 判断是否为第一个结点，需要特殊处理
        if(first == null && last == null) {
            // 新结点的next指向自身
            newNode.next = newNode;
            first = newNode;
            last = newNode;

        }else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        return true;
    }

    /**
     * 约瑟夫问题
     * eg.
     * 1 2 3 4 5 从第1个人开始从1数到2
     * 依次出队顺序为 2 4 1 5 3
     * @param n 总人数，每个人都有一个编号，从1开始
     * @param k 编号为k开始报数，1 2 3 ...
     * @param m 数到m的人出局
     */
    public void josephus(int n, int k, int m) {
        if(n < 1) {
            throw new IllegalArgumentException("人数n不能小于1");
        }
        if(k > n) {
            throw new IllegalArgumentException("参数k不能大于n");
        }

        for(int i = 1; i <= n; i++) {
            this.add(i);
        }

        // 找到编号为k的前一个人
        Node tmp = last;
        for(int j = 0; j < k-1; j++) {
            tmp = tmp.next;
        }
        System.out.println(String.format("第%s个人开始，向后数%s", tmp.next.item, m));

        while (true) {
            // 向后数到1...m
            // 找到待删除的前一个人
            for(int i = 0; i < m-1; i++) {
                tmp = tmp.next;
            }

            if(tmp.next == tmp) {
                System.out.println("最后一个出圈的人 = " + tmp.next.item);
                break;
            }
            System.out.println("出圈的人 = " + tmp.next.item);

            // 删除结点
            tmp.next = tmp.next.next;
        }
    }


    public void list() {
        Node tmp = first;
        if(tmp == null) {
            return;
        }

        while (true) {
            if(tmp == last) {
                // 最后一个结点
                System.out.println(tmp.item);
                break;
            }
            System.out.println(tmp.item);
            tmp = tmp.next;
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
