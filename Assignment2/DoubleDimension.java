package com.keyin;

public class DoubleDimension {

    int [][] arr  = null;


    public DoubleDimension (int rows, int columns){
        arr = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){

                arr[i] [j]= Integer.MIN_VALUE;
            }
        }
    }

    //Insert method
    public void insert(int valueToInsert, int rows, int columns){
        try {
            if (arr[rows][columns] == Integer.MIN_VALUE){
                arr[rows] [columns] = valueToInsert;
                System.out.println("Successfully inserted");
            }
            else {
                System.out.println("This Cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }

    //Traverse an array
    public void traverse(){
        try {
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr.length; i++){
                    System.out.println(arr[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist");
        }
    }

    //Search for an element
    public void searchArray (int valueToSearch){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                if (arr[i][j] == valueToSearch) {
                    System.out.println("Value is found at the index of " + i);
                    return;
                }
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    //Delete value from the array
    public void deleteValueAtIndex (int rows, int columns) {
        try {
            arr[rows] [columns]= Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }

    public static void main(String[] args) {
        DoubleDimension doubleDimension = new DoubleDimension(4,4);
        doubleDimension.insert(2,0,0);
        doubleDimension.insert(2,0,1);
        doubleDimension.insert(4,1,0);
        doubleDimension.insert(4,1,1);

        doubleDimension.traverse();
        doubleDimension.searchArray(4);
        doubleDimension.deleteValueAtIndex(0,4);
        doubleDimension.traverse();


    }
}



