package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int value) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == value) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int result = -1;
        for (; start < finish; start++) {
            if (data[start] == el) {
                result = start;
                break;
            }
        }
        return result;
    }
}