package ru.job4j.loop;

public class Mortgage {
    public int year( int amount, int salary, double percent ) { // 100 120 50
        int year = 0;
        double withPercent = (percent * amount) / 100;
        double sum = amount + withPercent;

        while ( sum >= 0 ) {
            double balance = sum - salary;
            double oneYear = balance * percent / 100;
            sum = oneYear + balance;
            year++;
        }
        return year;
    }
}
