package com.example.dsanew.linkedList;

public class CustomLinkedListImpl {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        /*linkedList.insertElementAtFirst(12);
        linkedList.insertElementAtFirst(21);
        linkedList.insertElementAtFirst(37);*/

        linkedList.insertElementAtLast(12);
        linkedList.insertElementAtLast(21);
        linkedList.insertElementAtLast(35);
        linkedList.insertElementAtLast(13);

        linkedList.printLinkedList();

        int middleValue = linkedList.findMiddleValue();
        System.out.println("middleValue = " + middleValue);
       /* linkedList.deleteFirstElement();

        System.out.println("After deleting :" + linkedList.getSize());
        linkedList.printLinkedList();

        System.out.println();

        linkedList.removeLastElement();
        linkedList.printLinkedList();*/

       /* // Creating the linked list: 4 -> 5 -> 1 -> 9
        CustomLinkedList.Node node1 = new CustomLinkedList.Node(4);
        CustomLinkedList.Node node2 = new CustomLinkedList.Node(5);
        CustomLinkedList.Node node3 = new CustomLinkedList.Node(1);
        CustomLinkedList.Node node4 = new CustomLinkedList.Node(9);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(null);


        linkedList.deleteGivenNode(node3);

        linkedList.printLinkedList();

        linkedList.printList(node1);*/

    }
}
