package com.mohit;

import java.util.Scanner;

public class multiDimension {
    public static void main(String[] args) {
        /*
          1 2 3
          4 5 6
          7 8 9
         */

        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][];

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 3},
//                {2, 54, 4, 3}
//        };

        int[][] arr = new int[3][3];

        // input
        for(int row=0; row<arr.length; row++){
            // for each col in a row
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
        // output
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}





















