package com.mohit;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(33);
        list.add(32);
        list.add(31);
        list.add(33);
        list.add(34);
        list.add(333);
        list.add(345);
        list.add(333);
        list.add(334);
        list.add(334);
        System.out.println(list);
        // u can also make some changes in the list :)
    }
}
