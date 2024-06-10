package com.mohit.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 44;

        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
    }

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}
