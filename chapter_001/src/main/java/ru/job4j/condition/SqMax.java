package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first < third) {        //max7: изменил first > third на first < third
                if (first > forth) {
                    result = third;
                }
            }
        } else if (second < third) {    //max6: изменил second > third на second < third
            if (second < forth) {       //max6: изменил second > forth на second < forth
                result = first;
            }
        } else if (third > forth) {
            result = second;
        }
        return result;
    }
}
