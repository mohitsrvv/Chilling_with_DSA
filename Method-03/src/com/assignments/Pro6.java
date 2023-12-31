package com.assignments;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

// Write a program to print the circumference and area of a circle
// of radius entered by user by defining your own method.
public class Pro6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your radius of circle: ");
        int radius = in.nextInt();

        double ans1 = circum(radius);
        double ans2 = area(radius);
        System.out.println("Circumference of circle is " + ans1);
        System.out.println("Area of circle is " + ans2);
        }
        public static double circum(int radius){
        double circum = 2 * 3.14 * radius;
        return circum;
    }
    public static double area(int radius){
        double area = 3.14 * radius * radius;
        return area;
    }

}






















