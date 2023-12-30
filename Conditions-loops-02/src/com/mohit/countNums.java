package com.mohit;

import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = in.nextInt();
        int count = 0;
// finding number of 3 in number
        while(n > 0){
            int rem = n % 10;
            if(rem == 3){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
