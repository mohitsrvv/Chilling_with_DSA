package com.mohit;

import java.util.Arrays;

// variable length argument
public class varArgs {
    public static void main(String[] args) {
        fun(2, 43, 234, 2, 4, 63, 11, 434, 31, 43, 94, 46, 32, 43);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
