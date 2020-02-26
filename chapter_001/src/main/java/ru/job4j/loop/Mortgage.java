package ru.job4j.loop;

public class Mortgage {
    public int year( int amount, int salary, double percent ) { // 100 120 50
        int year = 0;
        double withPercent = (percent * amount) / 100;
        double sum = amount + withPercent;

        while ( sum >= 0 ) {
            if (sum < salary ) {
                break;
            }
            sum -= salary;
            double balance = ((sum * percent) / 100) + sum;
            sum -= salary;
            year++;
        }
        while (sum < salary) {
            salary -= sum;
            year++;
            break;
        }
        return year;
    }
}
