package com.example.dsanew.linkedList;

import lombok.Getter;
import lombok.Setter;

/**
 * limitation of array :- you can't add more than defined elements
 * LinkedList
 * - try to break these boxes down into separate boxes
 * - stored in different memories
 */


/**
 * @author ronak-springboot-dev
 */
@Getter
@Setter
public class CustomLinkedList {
    //head and tail of the node are provided
    private Node head;
    private Node tail;

    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }


    public void insertElementAtFirst(int value) {
        //create new node
        Node node = new Node(value);

        //assign existing head to next to get new value in head
        node.next = head;

        //store latest created node in head
        head = node;

        if (tail == null) {
            tail = head;
        }

        //increase the size
        size++;
    }

    /**
     * method to insert element at last
     * @param value
     */
    public void insertElementAtLast(int value) {
        //create new node
        Node node = new Node(value);


        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }


    public void printLinkedList() {
        Node existingNode = head;

        while (existingNode != null) {
            System.out.print(existingNode.value);
            existingNode = existingNode.next;

            if (existingNode != null) {
                System.out.print("--> ");
            }
        }
    }

    @Getter
    @Setter
    private class Node {
        private int value;
        private Node next;  //next will point to new node , that's why the type is Node

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
