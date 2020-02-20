package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for ( int num = 2; num < number; num++ ) {
            if (number % num == 1) {
                prime = true;
                break;
            } else {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
