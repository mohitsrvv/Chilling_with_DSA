package com.mohit;

// practice of using two variables within the same name within the scope overlaps
public class shadowing {
    static int x = 99;
    public static void main(String[] args) {
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
