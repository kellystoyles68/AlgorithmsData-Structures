package com.keyin;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Node class definition
    public class Node {
        public int value;
        public Node next;
    }

    // Create a LinkedList
    public Node createLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert into a LinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // Traverse a LinkedList
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("The linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
     //   System.out.print("\n");
    }

    // Search for a node in a LinkedList
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("\n");
                    System.out.println ("The data value of the Node in the 4th position is  " + tempNode.value + ".\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
            System.out.println("Node not found!");
            return false;
        }
        return false;
    }

    // Deleting a Node from a single list
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The linked list does not exist");
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }}



