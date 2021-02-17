package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numMas = new int[10];
        String[] stringMas = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < stringMas.length; i++) {
            stringMas[i] = reader.readLine();
            numMas[i] = stringMas[i].length();
        }

        for (int i = 0; i < numMas.length; i++) {
            System.out.println(numMas[i]);
        }


    }
}
