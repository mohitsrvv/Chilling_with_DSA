package com.mohit;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // arrays for primitives
        int[] arr = new int[5];
        arr[0] = 22;
        arr[1] = 45;
        arr[2] = 55;
        arr[3] = 65;
        arr[4] = 43;

//        System.out.println(arr[3]);

        // input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // input using enhanced forEach
//        for(int j : arr){
//            System.out.print(j + " ");
//        }

        // another method to print
//        System.out.println(Arrays.toString(arr));

        // arrays for objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}

















