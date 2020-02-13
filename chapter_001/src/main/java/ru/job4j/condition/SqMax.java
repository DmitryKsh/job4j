package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = first;
        if (first < second) {        // testing: Было (first > second) изменил на (first < second)
            if (first < third) {
                if (first > forth) {
                    result = forth;
                }
            }
        } else if (second > third) {    // testing: Было (second < third) изменил на (second > third)
            if (second > forth) {      // testing: Было (second < forth) изменил на (second > forth)
                result = first;
            }
        } else if (third > forth) {     // testing: Было (third > forth) изменил на (third < forth)
            result = forth;
        }
        return result;
    }
}
