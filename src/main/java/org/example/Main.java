package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("Исходный список: ");
        myList.printList();
        myList.expandList();
        System.out.println("Развернутый список: ");
        myList.printList();
    }
}