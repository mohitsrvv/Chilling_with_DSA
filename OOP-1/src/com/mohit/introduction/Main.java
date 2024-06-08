package com.mohit.introduction;

public class Main {
    public void main(String[] args) {
        Student[] students = new Student[5];

        Student rahul = new Student();
//        rahul.rno = 23;
//        rahul.name = "Rahul Mehta";
//        rahul.marks = 66.78f;
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
    }
    // create a class
    class Student {
        int rno;
        String name;
        float marks;

        Student(){
            this.rno = 23;
            this.name = "Rahul Mehta";
            this.marks = 66.78f;
        }
    }
}















