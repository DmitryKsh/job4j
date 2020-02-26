package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first < second) {       // MAX84 изменил first > second на first < second
            if (first < third) {
                if (first < forth) {    // MAX84 изменил first > forth на first < forth
                    result = third;    // @Test max84
                }
            }
        } else if (second < third) {        // изменил second > third на second < third
            if (second < forth) {           // изменил second > forth на second < forth
                result = first;     // @Test max6
            }
        } else if (third > forth) {
            result = second;    // @Test max4
        } else if (second < first) {     // добавил еще одно условие для теста max5
            if (forth > second) {
                result = forth;     // @Test max5
            }
        }
        return result;
    }
}
