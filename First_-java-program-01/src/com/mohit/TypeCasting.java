package com.mohit;

public class TypeCasting {
    public static void main(String[] args) {
        //type casting
        int num = (int)(44.43f);
        System.out.println(num);

        // automatic type promotions in expressions
        int a = 257;
        byte b = (byte)(a);  // 257 % 256 = 1
        System.out.println(b);
    }
}
