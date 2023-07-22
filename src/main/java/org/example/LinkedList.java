package org.example;

public class LinkedList {
    Node head;


    public LinkedList() {}


    /**
     * Метод для добавления нового узла в конец списка
     * @param value - значение типа int для добаляемого узла списка
     */
    public void add(int value){
        Node current = head;
        if (current!= null) {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(value, null));
        }
        else {
            head = new Node(value, null);
        }
    }

    /**
     * Метод разворачивает односвязный список
     */
    public void expandList() {
        if(head != null && head.getNext() != null) {
            Node previous = head;
            Node current = head;
            Node nextNode = head.getNext();
            previous.setNext(null);
            while (nextNode != null) {
                current = nextNode;
                nextNode = current.getNext();
                current.setNext(previous);
                previous = current;
            }
            head = current;
        }
    }

    /**
     * Метод для вывода списка на экран
     */
    public void printList() {
        Node current = head;
        System.out.print("[ ");
        while(current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println("]");
    }
}


