package ru.job4j.calculator;

public class Fit {
    public static void main ( String[] args) {
      double man = Fit.manWeight(192.0);
      System.out.println("Man 192sm is " + man);
      double woman = Fit.womanWeight(175.0);
      System.out.println("Woman 175sm is " + woman);
    }

    public static double manWeight (double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight (double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
}
