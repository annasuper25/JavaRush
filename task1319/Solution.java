package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        String fileName = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            fileName = reader.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        File myFile = new File(fileName);
        FileWriter fileWriter = new FileWriter(myFile);
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(fileWriter);
        String text;

        while (!(text = bufReader.readLine()).equals("exit")){
            writer.write(text + "\r\n");
        }
        writer.write(text);

        writer.close();
        bufReader.close();
        reader.close();
    }
}
