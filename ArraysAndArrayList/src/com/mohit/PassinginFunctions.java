package com.mohit;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {33, 43, 45, 34};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 11;
    }
}
