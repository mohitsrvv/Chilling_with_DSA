package com.mohit.packges.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human mohit = new Human(21, "mohitsrv", 10000, false);
        Human aadesh = new Human(33, "aadesh bhai", 20000, true);

        System.out.println(mohit.population);
        System.out.println(aadesh.population);
    }
}
