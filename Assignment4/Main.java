package com.keyin;

    public class Main {
        public static void main(String[] args) {
            // Create an instance of your LinkedList class
            LinkedList linkedList = new LinkedList();

            // Use the methods from your LinkedList class
            linkedList.createLinkedList(64);
            linkedList.insertInLinkedList(89, 1);
            linkedList.insertInLinkedList(337, 2);
            linkedList.insertInLinkedList(45, 3);
            linkedList.insertInLinkedList(21, 4);
            linkedList.insertInLinkedList(12, 5);
            linkedList.insertInLinkedList(99, 6);

            //Print the original linked list
            System.out.print("\n");
            System.out.println("Original Linked List:");

            // Traverse the list
            linkedList.traverseLinkedList();

            // Search for a node
            linkedList.searchNode(21);

            // Example of different ways to delete a node and its data
            linkedList.deleteNode(0);
            //Delete head node
            System.out.println("New Linked List after the head Node was deleted.");
            linkedList.traverseLinkedList();
            System.out.print("\n");
            linkedList.deleteNode(3);
            //Print the new linked list
            System.out.print("\n"); System.out.println("New Linked List after data in Node position 3 was deleted.");
            linkedList.traverseLinkedList();
            System.out.print("\n");
             //Delete tail node
            linkedList.deleteNode(linkedList.size -1);
            //Print the new linked list
            System.out.print("\n");
            System.out.println("New Linked List after tail Node was deleted.");
            linkedList.traverseLinkedList();
            System.out.print("\n");
        }
    }

