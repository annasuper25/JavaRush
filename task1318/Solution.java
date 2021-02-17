package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        FileInputStream inStream = new FileInputStream(fileName);
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(inStream));

        /* Второй вариант - считать файл с помощью файлРидера:
        File myFile = new File(fileName);
        FileReader fileReader = new FileReader(myFile);
        BufferedReader reader = new BufferedReader(fileReader);
        */

        String line = null;
        while ((line = bufReader.readLine()) != null){
            System.out.println(line);
        }
        bufReader.close();
        br.close();
        inStream.close();
    }
}