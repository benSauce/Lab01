package com.saucedo.lab02;

import java.util.Scanner;

public class Lab02_PtSix {
    //main method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = input.nextLine();

        // Display Reverse Order
        System.out.println("Original String: \n" + s);
        System.out.println("Reverse Order: ");
        reverseDisplay(s);
    }

    public static void reverseDisplay(String s) {
        if ((null == s) || (s.length() <= 1)) {
            System.out.println(s);
        } else {
        System.out.println(reverseDisplay(s.substring(1)) + s.charAt(0));
        }
    }
}