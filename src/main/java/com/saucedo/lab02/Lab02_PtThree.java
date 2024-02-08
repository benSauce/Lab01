package com.saucedo.lab02;

import java.util.Scanner;

public class Lab02_PtThree {
    //main method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative nonzero integer: ");
        int n = input.nextInt();

        // Display Sum
        System.out.println("Recursive fractional Sum of " + n + " is " + sumOfFracDen(n));
    }

    /** Return added sum of fractions for the specified number */
    public static double sumOfFracDen(double n) {
        if (n == 0){
            return 0;
        }
        if (n == 1) {
            // Base case
            return ((double) 1 /3);
        }
        else {
            return 1.0 /n + sumOfFracDen( n-1); // Recursive call
        }
    }
}