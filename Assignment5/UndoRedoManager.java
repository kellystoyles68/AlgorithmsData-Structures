package com.keyin;


public class UndoRedoManager<T> {
    private class Node {
        private T state;
        private Node prev;
        private Node next;
        private Node (T state) {
            this.state = state;
        }

    }
    private Node currentState;

    //Operation: add state
    public void  addState (T newState) {
        //create a new node for the new task
        Node newNode = new Node(newState);
        //Set the links for the new Node
        newNode.prev = currentState;
        newNode.next = null;
        //Update the next link for the current state
        if (currentState !=null){
            currentState.next = newNode;
        }
        //update the current to the new state
        currentState = newNode;
    }
    //Operation: Undo state
    public T undo(){
        if (currentState == null){
            //currentState  is  null  upon initialization
            System.out.println("\nNo state to undo");
            return null;
        }

        //Get the previous state
        Node previousState = currentState.prev;
        if (previousState ==null){
            System.out.println("\nReached the initial state");
            return null;
        } else {
            //update the current state to the previous state
            currentState = previousState;
        }
        return currentState.state;
    }

    //Operation: Redo state
    public T redo() {
        if (currentState == null) {
            //currentState  is  null  upon initialization
            System.out.println("\nNo state to redo");
            return null;
        }
        // Get the next state
        Node nextState = currentState.next;
        if (nextState == null) {
            System.out.println("\nReached the latest state");
            return null;
        } else {
            // Update the current state to the next state
            currentState = nextState;
        }
        return currentState.state;
    }


    public static void main(String[] args) {
        System.out.println("\nProject requirements. \n- Implement an application that support undo/redo functionality. \n- Use a linked list to maintain a sequence of states." +
                "\n- Each state change is stored as a node in the list, allowing for easy navigation");

        UndoRedoManager<String> undoRedoManager = new UndoRedoManager<>();
        undoRedoManager.addState("State 1");
        undoRedoManager.addState("State 2");
        undoRedoManager.addState("State 3");
        undoRedoManager.addState("State 4");
        undoRedoManager.addState("State 5");
        undoRedoManager.addState("State 6");
        undoRedoManager.addState("State 7");

        System.out.println("\nCurrent State: " + undoRedoManager.currentState.state);
        undoRedoManager.undo();
        System.out.println("\nCurrent State after undo is: " + undoRedoManager.currentState.state);
        undoRedoManager.undo();
        System.out.println("Current State after undo is: " + undoRedoManager.currentState.state);

        System.out.println("\nCurrent State: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
        System.out.println("\nCurrent State after redo is: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
          //System.out.println("Current State: " + undoRedoManager.currentState.state);
       System.out.println("Current State after redo is: " + undoRedoManager.currentState.state);
        undoRedoManager.redo();
    }
}
