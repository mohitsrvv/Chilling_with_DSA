package com.assignments;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

// A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class Pro3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        String ans = voteAge(age);
        System.out.println("You are " + ans);
    }
    public static String voteAge(int age){
        if(age >= 18){
            return "eligible to vote";
        } else {
            return "not eligible to vote";
        }
    }
}


























