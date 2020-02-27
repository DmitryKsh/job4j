package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 1;
        for (int number = 2; number <= finish; number++ ) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
