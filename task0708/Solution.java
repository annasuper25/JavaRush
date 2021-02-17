package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        List<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int maxLenght = strings.get(0).length();
        ArrayList<String> listMax = new ArrayList<String>();

        for (int i = 1; i < strings.size(); i++) {
            if(strings.get(i).length() > maxLenght){
                maxLenght = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == maxLenght){
                listMax.add(strings.get(i));

            }
        }
        for (int i = 0; i < listMax.size(); i++) {
            System.out.println(listMax.get(i));
        }
        reader.close();
    }

}
