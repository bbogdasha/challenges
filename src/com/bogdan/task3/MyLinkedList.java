package com.bogdan.task3;

public class MyLinkedList {

    Node head;

    public static class Node {

        Node next;
        Object data;

        public Node(Object data) {
            next = null;
            this.data = data;
        }
    }
}
