package com.assignments;

import java.util.Scanner;

// Take 2 numbers as input and print the largest number.
public class Pro4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double num1 = in.nextDouble();
        System.out.print("Enter your second number: ");
        double num2 = in.nextDouble();
        double larger = Math.max(num1, num2);
        System.out.println("Your largest number is " + larger);
    }
}
