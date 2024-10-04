package com.keyin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println("\nWelcome to the World of Double LinkedLists!\n");

        // Create a new doubly linked list with an initial node
        dll.createDLL(10);

        // Insert nodes at various positions
        dll.insertAtBeginning(5);
        dll.insertAtEnding(30);
        dll.insertAnywhere(20, 1);

        // Traverse the list to see the result
        dll.traverseDLL();

        // Reverse traverse the list to see the reversed result
        dll.reverseTraverseDLL();
    }
}
