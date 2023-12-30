package com.assignments;

import java.util.Scanner;

// area of circle
public class Pro1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = in.nextDouble();
        double area = 3.14 * r * r;
        System.out.println("Area of circle: " + area);
    }
}
