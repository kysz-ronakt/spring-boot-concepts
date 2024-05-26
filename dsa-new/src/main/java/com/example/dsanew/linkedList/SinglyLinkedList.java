package com.example.dsanew.linkedList;

import java.util.LinkedList;

public class SinglyLinkedList {


    Node head;
    Node tail;


    public SinglyLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
    }

    public SinglyLinkedList() {

    }


    //method to add elements in linkedList

    public static void main(String[] args) {
      /*  SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);

        System.out.println("singlyLinkedList = " + singlyLinkedList);*/


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);

    }

    public void add(int value) {
        Node node = new Node(value);
        tail.setNext(node.getNext());
        tail = node;
    }
}
