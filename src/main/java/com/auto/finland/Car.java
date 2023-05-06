package com.auto.finland;

public class Car {
    private String model;
    private int power;
    private int year;

    public Car(String model, int power, int year) {
        this(model,power);
        this.year = year;
    }
    public Car(String model, int power){
        this(model);
        this.power = power;
    }
    public Car(String model){
        this();
        this.model = model;
    }
    public Car(){
        model = "Volkswagen";
        power = 135;
        year = 2018;
    }

    public void print(){
        System.out.println("Model: " + model + "; power: " + power + "; year: " + year );
    }
}
