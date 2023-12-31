package com.assignments;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

// Define a method that returns the product of two numbers entered by user.
public class Pro5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = in.nextInt();
        System.out.print("Enter second number: ");
        int second = in.nextInt();

        int ans = product(first, second);
        System.out.println("ans is " + ans);
    }
    public static int product(int first, int second){
        int product = first * second;
        return product;
    }
}






























