package com.assignments;

import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
public class Pro5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how much fibonacci numbers you want: ");
        long count = in.nextLong();
        int n1=0, n2=1, n3;
        System.out.print(n1 + " " + n2);
        for(int i=2; i<count; i++){
            n3 = n2 + n1;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
