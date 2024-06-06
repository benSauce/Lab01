package com.saucedo.lab02;

import java.util.Scanner;

public class Lab02_Pt06_03 {
    public static long count = 0;
    //main method
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = input.nextLine();
        System.out.print("Enter a Char to count: ");
        String b = input.nextLine();
        char c = b.charAt(0);

        // Display Reverse Order
        System.out.println("Original String: " + s + " and Char: " + c);
       //Count Specified Char
        countChar(s, c);
    }

    public static void countChar(String s, char c) {
        if (s.length() < 1) {
            System.out.print(c + " count is: " + count);
        } else {
            //Check Char at first position, add to count if match
            if (s.charAt(0) == c){
                count++;
            };
            //Call a new substring without first position
            countChar(s.substring(1, s.length()), c);
        }
    }
}