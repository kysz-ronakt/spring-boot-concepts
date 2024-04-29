package com.dev.dsa.linearSearch;

public class ReverseLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; // Can be a generic type
        private ListNode next; // Reference to next ListNode in list

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode() {

        }
    }


    //method to display
    public void display() {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }


    /*public void insert(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;


    }*/

    public static void main(String[] args) {
        ReverseLinkedList listNode = new ReverseLinkedList();
        listNode.addValuesInLinkedList(2);
        listNode.addValuesInLinkedList(3);
        listNode.addValuesInLinkedList(4);
        listNode.addValuesInLinkedList(5);

        listNode.display();
    }


    public void addValuesInLinkedList(int value) {

        ListNode node = new ListNode(value);

        //this is to add very first value in list
        if (head == null) {
            head = node;
            return;
        }

        //now head has current values soo...assign current value from head to current

        ListNode current = head;

        if (current.next != null) {
            current = current.next;
        }

        current.next = node;

    }


}
