package com.mohit;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int[] arr = {1,32,42,46,75};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;  // if you make an change to an object via this ref variable, same object will be change
    }
}
