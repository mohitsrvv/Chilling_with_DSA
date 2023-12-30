package com.assignments;

import java.util.Scanner;

// area of triangle
public class Pro2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        double base = in.nextDouble();
        System.out.print("Enter the height of triangle: ");
        double height = in.nextDouble();
        double area = (base * height)/2;
        System.out.println("Area of triangle: " + area);
    }
}
