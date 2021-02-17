package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/


import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        ArrayList<Integer> numList = new ArrayList<Integer>();
        ArrayList<Integer> numEvenList = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        try {
            fileName = reader.readLine();
            InputStream inStream = new FileInputStream(fileName);
            BufferedReader bReader = new BufferedReader(new InputStreamReader(inStream));

            String line;
            while ((line = bReader.readLine()) != null){
                numList.add(Integer.parseInt(line));
            }

            for (Integer i: numList) {
                if(i%2==0){
                    numEvenList.add(i);
                }
            }
            Collections.sort(numEvenList);

            for (Integer n: numEvenList) {
                System.out.println(n.toString());
            }
            reader.close();
            inStream.close();
            bReader.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}
