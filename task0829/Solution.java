package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        List<String> citys = new ArrayList<>();
        List<String> familys = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(i%2==0){
                citys.add(list.get(i));
            }
            else {
                familys.add(list.get(i));
            }
        }

        String city = reader.readLine();
        int index=0;
        for(String cityOfList : citys ){
            if (city.equals(cityOfList)) {
                index = citys.indexOf(city);
            }
        }
        System.out.println(familys.get(index));

        // Read the house number
        /*int houseNumber = Integer.parseInt(reader.readLine());
        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }*/
    }
}
