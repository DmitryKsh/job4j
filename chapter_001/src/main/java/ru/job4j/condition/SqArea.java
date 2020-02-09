package ru.job4j.condition;

public class SqArea {
    public static void main (String[] args) {
        double result1 = SqArea.square(6,2);
        System.out.println("p = 6, k = 2, s = 1, real = " + result1);
    }

    public static double square(int p, int k) {
        // p = 2 * ( L + h )  >>  6 = 2 * ( 2 + 1 )

        double h = p/(2*(k+1));
        double L = h * k;
        double S = L * h;
        return S;
    }
}
