package com.mohit;

import java.util.Arrays;
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
//        int[][] arr = new int[2][];
        Scanner in = new Scanner(System.in);
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };
        // taking input
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // now taking the input from the user
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; arr[row].length > col; col++) {
                arr[row][col]  = in.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}















