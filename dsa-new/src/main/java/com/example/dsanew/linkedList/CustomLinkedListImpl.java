package com.example.dsanew.linkedList;

public class CustomLinkedListImpl {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        int size = linkedList.getSize();
        System.out.println("size = " + size);


        linkedList.add(12);
        linkedList.add(21);
        linkedList.add(35);

        linkedList.printLinkedList();
    }
}
