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

    /**
     * Method to insert element at very first index
     * @param value
     */

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
     *
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

    /**
     * method to delete first element from list
     */
    public void deleteFirstElement() {

        //if head is not null then move the head to next element , this will delete the first element
        if (head != null) {
            head = head.next;
        }

        //decrease the size of list
        size--;
    }

    /**
     * Method to print Added elements in the list
     */
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

    /**
     * Method to remove last element from the Linkedlist
     */
    public void removeLastElement() {

        if (head != null && head.next != null) {

            Node second_last_element = head;

            /*
             * So if we have 1->3->4->null
             * Whenever it gets to 3 it shall setNext to null so the new array will look like this 1->3->null
             * */

            while (second_last_element.next.next != null) {
                second_last_element = second_last_element.next;
            }

            second_last_element.next = null;
            size--;
        }
    }

    /**
     * Structure of each internal Node
     */
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

        public Node() {
        }
    }
}
