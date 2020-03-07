package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int value) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == value) {
                result = index; // или result = 0;
            }
        }
        return result;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int result = -1; // если элемента нет в массиве, то возвращаем -1.
        for (; start < finish; start++) {
            if (data[start] == el) {
                result = start;
            }
        }
        return result;
    }
}