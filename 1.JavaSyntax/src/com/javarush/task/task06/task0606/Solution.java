package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        while (a>0) {
        if (a%2==0) {
            even++;
        } else {
            odd++;
        }
        a/=10;
    }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
