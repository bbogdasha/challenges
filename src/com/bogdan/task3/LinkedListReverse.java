package com.bogdan.task3;

import com.bogdan.task3.MyLinkedList.Node;

public class LinkedListReverse {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new Node(5);
        myLinkedList.head.next = new Node(9);
        myLinkedList.head.next.next = new Node(1);
        myLinkedList.head.next.next.next = new Node(10);
        myLinkedList.head.next.next.next.next = new Node(12);

        printLinkedList(myLinkedList);
        reverseLinkedList(myLinkedList);
        printLinkedList(myLinkedList);
    }

    public static void printLinkedList(MyLinkedList linkedList) {
        Node head = linkedList.head;
        while (linkedList.head != null) {
            System.out.print(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }
        System.out.println();
        linkedList.head = head;
    }

    public static void reverseLinkedList(MyLinkedList linkedList) {
        Node previous = null;
        Node current = linkedList.head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        linkedList.head = previous;
    }
}