package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String color;
    private String address;

    public void initialize(String name) {
        this.name = name;
        this.age = 12;
        this.weight = 6;
        this.color = "black";
        this.address = null;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = "black";
    }

    public void initialize(String name, int age) {
        this.age = age;
        this.name = name;
        this.weight = 12;

    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 12;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.name = null;
        this.age = 4;
    }


    public static void main(String[] args) {

    }
}
