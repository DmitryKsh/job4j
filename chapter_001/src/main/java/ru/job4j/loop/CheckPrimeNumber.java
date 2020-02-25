package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int num = 2;
        boolean prime = false;
        if (number > 1) {
            if (number % num != 0) {
                num++;
                prime = true;
            } else if (number % num == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
