package com.saucedo.lab02;

import java.util.Scanner;

public class Lab02_PtTwo {
    //main method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative nonzero integer: ");
        int n = input.nextInt();

        // Display Sum
        System.out.println("Recursive fractional Sum of " + n + " is " + sumOfFrac(n));
    }

    /** Return added sum of fractions for the specified number */
    public static double sumOfFrac(int n) {
        if (n == 1) {
            // Base case
            return 1;
        }
         else {
            return 1.0 /n + sumOfFrac( n-1); // Recursive call
        }
    }
}