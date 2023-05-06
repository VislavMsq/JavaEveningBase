package com.auto.germany;

public class Car {
    // поля(fields), либо переменные экземпляра класса
    public String model = "Audi";
    public int power = 320;
    public int year = 2022;

    public final String GROUP_NAME = "21032023";

    // статические перемненные
    public static int birthYear = 1980;

    public void printCar(){
        String type = "Sedan";
        System.out.println(type);
    }
}
