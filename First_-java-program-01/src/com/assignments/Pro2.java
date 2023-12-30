package com.assignments;

import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.
public class Pro2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hey good morning " + name);
    }
}
