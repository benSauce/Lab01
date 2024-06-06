package com.saucedo.lab02;
import java.util.Scanner;

public class Lab02_Pt05 {
    //Compute Fibonacci
    public static long count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fibonacci Number: ");
        int n = sc.nextInt();

        long result = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
        System.out.println("Fibonacci was called "+ count + " time(s).");
        sc.close();
    }

    private static long fib(int n) {
        count++;
        if(n<=1) {
            return n;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
}