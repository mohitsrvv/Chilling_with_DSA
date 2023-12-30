package com.assignments;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.
public class Pro1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = in.nextInt();
        if(a % 2 == 0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
