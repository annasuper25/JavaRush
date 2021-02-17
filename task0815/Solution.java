package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Колян");
        map.put("Смирнов", "Иван");
        map.put("Гончаров", "Лёха");
        map.put("Васильков", "Тарас");
        map.put("Дворов", "Пивас");
        map.put("Тарабрин", "Игорь");
        map.put("Бурмистров", "Виталий");
        map.put("Гончаровский", "Костян");
        map.put("Ивановский", "Иван");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int sumRepeatNames=0;

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();
            if(value == name)sumRepeatNames++;
        }
        return sumRepeatNames;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int sumRepeatLastnames=0;

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();
            if(key == lastName)sumRepeatLastnames++;
        }
        return sumRepeatLastnames;

    }

    public static void main(String[] args) {
//        System.out.println(getCountTheSameFirstName(createMap(),"Виталий" ));
 //       System.out.println(getCountTheSameLastName(createMap(), "Иванов"));
    }
}
