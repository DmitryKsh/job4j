package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = first;
        if (first > second) { // изменил
            if (first < third) {
                if (first > forth) { // изменил
                    result = forth; // изменил.
                }
            }
        } else if (second > third) {
            if (second > forth) {
                result = first;
            }
        } else if (third > forth) {
            result = second;
        }
        if (second < third ) {
            if (second < forth) {
                result = second;
            }
        }
        return result;
    }
}
