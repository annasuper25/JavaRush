package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandMother = new Human("LENA", false, 70);
        Human grandMother2 = new Human("NONNA", false, 62);

        Human grandFather = new Human("IVAN", true, 65);
        Human grandFather2 = new Human("VLAD", true, 69);

        Human Father = new Human("PAPA", true, 45, grandFather, grandMother);
        Human Mother = new Human("MAMA", false, 43, grandFather2, grandMother2);

        Human Son = new Human("SON", true, 15, Father, Mother);
        Human Son2 = new Human("SON2", true, 18, Father, Mother);
        Human Daughter = new Human("Daughter", false, 11, Father, Mother);

        System.out.println(grandMother);
        System.out.println(grandMother2);

        System.out.println(grandFather);
        System.out.println(grandFather2);

        System.out.println(Father);
        System.out.println(Mother);

        System.out.println(Son);
        System.out.println(Son2);
        System.out.println(Daughter);
    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}