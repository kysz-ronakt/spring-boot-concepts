package com.example.dsanew.linkedList;

public class CustomLinkedListImpl {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        int size = linkedList.getSize();
        System.out.println("size = " + size);


        /*linkedList.insertElementAtFirst(12);
        linkedList.insertElementAtFirst(21);
        linkedList.insertElementAtFirst(35);*/

        linkedList.insertElementAtLast(12);
        linkedList.insertElementAtLast(21);
        linkedList.insertElementAtLast(35);
        linkedList.insertElementAtLast(13);

        linkedList.printLinkedList();

        linkedList.deleteFirstElement();

        System.out.println();
        linkedList.printLinkedList();

    }
}
