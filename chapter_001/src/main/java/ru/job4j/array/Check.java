package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
            if (data[0] == data[1]) {
                if (data[1] == data[2]) {
                    result = true;
                }
                if (data[2] == data[0]) {
                    result = true;
                }
            } else {
                result = false;
            }
        return result;
    }
}
