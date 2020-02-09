package ru.job4j.converter;

public class Converter {
    public static void main (String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles == 2. Test result: " + passed);

        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
        int a = 180;
        int expected2 = 3;
        int out2 = rubleToDollar(a);
        boolean test = expected2 == out2;
        System.out.println("180 rubles == 3. Test result: " + test);

        int rubleD = Converter.dollarToRuble(20);
        System.out.println("20 dollars are " + rubleD + " rub.");
        int b = 20;
        int expected3 = 1200;
        int out3 = dollarToRuble(b);
        boolean test2 = expected3 == out3;
        System.out.println("20 dollars == 1200. Test result: " + test2);

        int rubleE = Converter.euroToRuble(14);
        System.out.println("14 euro are " + rubleE + " rub.");
        int c = 14;
        int expected4 = 980;
        int out4 = euroToRuble(c);
        boolean test3 = out4 == expected4;
        System.out.println("20 dollars == 980. Test result: " + test3);
    }

    public static int rubleToEuro ( int value ) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar( int value ) {
        int rsl = value / 60;
        return rsl;
    }

    public static int dollarToRuble ( int value ) {
        int rsl = value * 60;
        return rsl;
    }

    public static int euroToRuble ( int value ) {
        int rsl = value * 70;
        return rsl;
    }
}
