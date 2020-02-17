package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean num = right > left;
        int result = num ? right : left;
        return result;
    }
}
