package com.assignments;

import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Pro3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter P: ");
        int p = in.nextInt();
        System.out.print("Enter T: ");
        int t = in.nextInt();
        System.out.print("Enter R: ");
        int r = in.nextInt();
        int si = (p*t*r)/100;
        System.out.print("Your SI: " + si);
    }
}
