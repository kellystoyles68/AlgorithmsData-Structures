package com.keyin;

import java.util.Scanner;

public class AverageTemperatures {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double [] temperatures = new double [5];
            double sum = 0.0;
            // Step 1: Get Use to enter daily temperatures
            System.out.println ("Please enter 5 daily temperatures:");

            for (int i = 0; i < 5; i++) {
                System.out.println("Temperature " + (i + 1) + ":");
                temperatures [i] = scanner.nextDouble();
                sum += temperatures [i];
            }
            // Step 2: Compute the average temperature
            double average = sum / temperatures.length;
            System.out.println("The average temperature is: " + average);

            // Step 3: Compare daily temperatures to the average and count how many are above average
            int countAboveAverage = 0;
            for (double temp : temperatures) {
                if (temp > average) {
                    countAboveAverage++;
                }
            }
            System.out.println("Number of days with temperatures above average are: " + countAboveAverage);

            scanner.close();
        }
}
