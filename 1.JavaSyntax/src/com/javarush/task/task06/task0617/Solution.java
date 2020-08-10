package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea (Idea idea) {
        String a = idea.getDescription();
        System.out.println(a);
    }

    public static class Idea {
        public String getDescription() {
            return "hi";
        }

    }

    //напишите тут ваш код
}
