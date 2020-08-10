package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.IllegalCharsetNameException;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        if (a > 0){
            int maximum = Integer.parseInt(reader.readLine());
            while (a > 1) {  //количество повторений a - 1, так как для инициализации maximum уже одно считали
                int num = Integer.parseInt(reader.readLine());
                if (num > maximum) maximum = num;
                a--;
            }
            System.out.println(maximum);
        }
    }
}
