package com.keyin;


public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    //Create a DLL
    public DoublyNode createDLL (int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        size = 1;
        System.out.println("DLL created with initial node value: " + nodeValue);
        return head;
    }


    //insert into a DLL
    // Inserting at a specific location
    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        //0. If link list doesn't

        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }




    //1. Inserting at the beginning
    public void insertAtBeginning(int nodeValue) {
        insertDLL(nodeValue, 0);
        System.out.print("the beginning value is: " + nodeValue);
    }
    //2. Inserting at the ending
    public void insertAtEnding(int nodeValue) {
        insertDLL(nodeValue, size);
        System.out.print("\nthe ending value is: " + nodeValue);
    }
    //3. Insert anywhere
    public void insertAnywhere(int nodeValue, int location) {
        insertDLL(nodeValue, location);
        System.out.print("\n\n");
    }



    //Traverse a Linked List
    public void traverseDLL(){
        if (head == null) {
            System.out.println("DLL does not exist");
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <-> ");

                }
                tempNode = tempNode.next;
            }
                System.out.print( "\n");
            }
        }


    // Reverse Traverse
    public void reverseTraverseDLL(){
        if (tail == null) {
            System.out.println("DLL does not exist");
        } else {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1) {
                    System.out.print(" <-> ");
                }
                tempNode = tempNode.prev;
            }
        }
        System.out.print("\n");
    }


    // Search Node
    public void searchDLL(int nodeValue){
        if(head == null) {
            System.out.println("DLL is empty");
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            boolean found = false;
            while (tempNode != null) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node found at index: " + index);
                    found = true;
                    break;
                }
                tempNode = tempNode.next;
                index++;
            }
            if (!found) {
                System.out.println("Node not found in DLL");
            }
        }
    }

    // Deletion Method
    public void deleteDLL() {
        if(head == null) {
            System.out.println("DLL is already empty");
        } else {
            head = null;
            tail = null;
            size = 0;
            System.out.println("DLL successfully deleted");
        }
    }
    // Delete entire DLL
 //   DoublyLinkedList dll = new DoublyLinkedList();
 //   dll.deleteDLL();


}


