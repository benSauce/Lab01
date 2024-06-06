package com.saucedo.lab02;

import java.util.Scanner;

public class Lab02_Pt06_04 {
    public static int sum = 0;
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();

        //Add digits and print
        System.out.print("The sum is: " + sumDigits(n));
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return sum;
        } else {
            //seperate the digits and cast to int
            return sum =  (int)(n % 10) + sumDigits(n / 10);
            }
    }
}