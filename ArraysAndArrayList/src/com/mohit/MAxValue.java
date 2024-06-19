package com.mohit;

public class MAxValue {
    public static void main(String[] args) {
        int[] arr = {3, 22, 5, 6, 41, 33};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
