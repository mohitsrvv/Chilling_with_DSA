package com.mohit.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight){
        super(l, h, w); // whats this>. it saying call the parent class constructor
        // used to initialise values present in parent class
        this.weight =  weight;
    }
}
