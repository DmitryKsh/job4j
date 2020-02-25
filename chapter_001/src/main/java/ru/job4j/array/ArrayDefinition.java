package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args){
        short [] ages = new short [10];
        String [] surnames = new String[100500];
        float [] prices = new float[40];

        String[] name = new String[3];

        name[0] = "Petr Arsentev";
        name[1] = "Edward Ford";
        name[2] = "Patrick Stone";

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
    }
}
