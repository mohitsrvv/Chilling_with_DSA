package com.assignments;

import java.util.Scanner;

// Define a program to find out whether a given number is even or odd.
public class Pro2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();

        String ans = evenOdd(num);
        System.out.println("Your answer is " + ans);

    }
    public static String evenOdd(int num){
        if(num % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }
}



















