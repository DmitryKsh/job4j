package ru.job4j.condition;

public class Point {
    public static void main (String[] args) {
        double result = Point.distance(4,4,2,2);
        System.out.println("result (4,2) to (4,2) " + result);
    }

    public static double distance (int x1, int y1, int x2, int y2) {
        double x = x1 - x2;
        double y = y1 - y2;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double a = first + second;
        double rsl = Math.sqrt(a);
        return rsl;
    }
}
