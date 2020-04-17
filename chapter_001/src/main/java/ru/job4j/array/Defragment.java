package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int pointIns = 0;
        for (int index = 0; index < array.length; index++, pointIns++) {
            if (array[index] == null) {
                int point = index;
                while (point < array.length && array[point] == null) {
                    point++;
                }
                if (point == array.length) {
                    break;
                }
                array[pointIns] = array[point];
                array[point] = null;

                index = point - 1;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}