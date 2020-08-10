package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("mike", 23, "1");
        Man man2 = new Man("mike", 23, "1");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);

        Woman woman1 = new Woman("23",13 , "1");
        Woman woman2 = new Woman("23", 13, "1");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);

    }

    public static class Man {

         private String name;
        private int age;
        private String address;

        public Man( String name,int age, String address) {
            this.age = age;
            this.name = name;
            this.address = address;
        }
    }

    public static class Woman {
        private int age;
        private String name;
        private String address;

        public Woman( String name,int age, String address) {
            this.age = age;
            this.name = name;
            this.address = address;
        }
    }
}
