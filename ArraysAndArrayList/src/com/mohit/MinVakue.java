package com.mohit;

public class MinVakue {
    public static void main(String[] args) {
        int[] arr = {3, 433, 3, 431, 32,1};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
