package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
Для запуска программы нужно указать параметры командной строки (Program arguments) - см. Условие
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    public static void main(String[] args) {
        try{
            String command = args[0];
            if (command.equals("-c")) {
                create(args);
            }
            else if(command.equals("-u")) {
                update(args);
            }
            else if(command.equals("-d")) {
                delete(args);
            }
            else if (command.equals("-i")){
                info(args);
            }
        }
        catch( ParseException e){
            e.printStackTrace();
        }
    }

    public static void create(String[] args) throws ParseException {
        Person p = null;
        Date bd = format.parse(args[3]);
        if (args[2].equals("м")) {
            p = Person.createMale(args[1], bd);
        }
        if (args[2].equals("ж")) {
            p = Person.createFemale(args[1], bd);
        }
        allPeople.add(p);
        System.out.println(allPeople.indexOf(p));
    }

    public static void update(String[] args) throws ParseException {
        int index = Integer.parseInt(args[1]);
        if (allPeople != null && !allPeople.isEmpty() && allPeople.size()> index) {
            allPeople.get(index).setName(args[2]);
            if (args[3].equals("м")) {
                allPeople.get(index).setSex(Sex.MALE);
            }
            else if (args[3].equals("ж")) {
                allPeople.get(index).setSex(Sex.FEMALE);
            }
            allPeople.get(index).setBirthDate(format.parse(args[4]));
        }
    }

    public static void delete(String[] args){
        int index = Integer.parseInt(args[1]);
        if (allPeople != null && !allPeople.isEmpty() && allPeople.size()> index) {
            allPeople.get(index).setName(null);
            allPeople.get(index).setSex(null);
            allPeople.get(index).setBirthDate(null);
        }
    }

    public static void info(String[] args){
        int index = Integer.parseInt(args[1]);
        if (allPeople != null && !allPeople.isEmpty() && allPeople.size()> index) {
            Person p = allPeople.get(index);
            String sx = (p.getSex() == Sex.MALE) ? "м" : "ж";
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(p.getName() + " " + sx + " " + sdf.format(p.getBirthDate()));
        }
    }
}