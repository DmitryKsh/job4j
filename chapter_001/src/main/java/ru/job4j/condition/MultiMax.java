package ru.job4j.condition;

public class MultiMax {
    public int max (int first, int second, int third) {

        if (first > second) {
            if (first > third) {
                int result = first;
                return result;
            }
        }

        if (second > first) {
            if (second > third) {
                int result = second;
                return result;
            }
        }

        if (third > first) {
            if (third > second) {
                int result = third;
                return result;
            }
        }
        return 0;
    }
}

