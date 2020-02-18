package ru.job4j.loop;

public class Counter {
    public static int sum (int start, int finish) {
        int sum = 0;
        for (start = start; start <= finish; start++) {
            sum = sum + start;
            System.out.println(sum);
        }
        return sum;
    }
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for ( start = start; start <= finish; start++ ) {
            if ( 0==(start%2) && start <= 0 ) {
                sum = sum + (-1 * start) ;
            } else if (0==(start%2) && start >= 0){
                sum += start;
            }
        }
        return sum;
    }

    public static void main (String[] args) {
        System.out.println(sum(0,10));
        System.out.println(sum(3,8));
        System.out.println(sum(1,1));
    }
}
