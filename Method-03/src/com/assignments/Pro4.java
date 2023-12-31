package com.assignments;

import java.util.Scanner;

// Write a program to print the sum of two numbers entered by user by defining your own method.
public class Pro4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = in.nextInt();
        System.out.print("Enter second number: ");
        int second = in.nextInt();

        int ans = sum(first, second);
        System.out.println("ans is " + ans);
    }
    public static int sum(int first, int second){
        int sum = first + second;
        return sum;
    }
}
































