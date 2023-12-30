package com.assignments;

import java.util.Scanner;

// area of rectangle
public class Pro3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your length: ");
        double length = in.nextDouble();
        System.out.print("Enter your breadth: ");
        double breadth = in.nextDouble();
        double area = length * breadth;
        System.out.println("Area: " + area);
    }
}
