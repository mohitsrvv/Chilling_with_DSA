package com.mohit.introduction;

public class Main {
    public void main(String[] args) {
        Student[] students = new Student[5];

        Student rahul = new Student(13, "Rahul mehta", 44.55f);
//        rahul.rno = 23;
//        rahul.name = "Rahul Mehta";
//        rahul.marks = 66.78f;
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

        rahul.greeting();
    }
    // create a class
    class Student {
        int rno;
        String name;
        float marks;

        void greeting(){
            System.out.println("Hello! my name is " + name);
        }

        Student(int rno, String name, float marks){
            rno = rno;
            name = name;
            marks = marks;
        }
    }
}

