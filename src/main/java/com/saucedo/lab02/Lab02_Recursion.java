package com.saucedo.lab02;
import java.util.Scanner;
public class Lab02_Recursion {
    //main method
    public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a nonnegative integer: ");
    int n = input.nextInt();

    // Display Sum
    System.out.println("Recursive Sum of " + n + " is " + sumOf(n));
    }

    /** Return added sum for the specified number */
    public static int sumOf(int n) {
        if (n == 0) {
            // Base case
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + sumOf(n - 1); // Recursive call
        }
    }
}