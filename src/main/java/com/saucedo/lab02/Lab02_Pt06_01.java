package com.saucedo.lab02;

import java.util.Scanner;

public class Lab02_Pt06_01 {
    //main method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non negative integer: ");
        int n = input.nextInt();

        // Display Reverse Order
        System.out.println("Original int: \n" + n);
        System.out.println("Reverse Order: ");
        reverseDisplay(n);
    }

    public static void reverseDisplay(int n) {
        if (n < 10) {
            // Base case
            System.out.print(n);
        } else {
            System.out.print(n%10);
            reverseDisplay(n/10); // Recursive call
        }
    }


}