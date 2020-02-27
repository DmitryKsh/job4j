package ru.job4j.calculator;

/**
 *  Calculator
 * Класс Calculator предназначен для вычисления суммы входящих чисел.
 * @author Dmitry Kreshchenok (dcphosphene@gmail.com)
 */

public class Calculator {
    /**
     * Method main.
     * Передает значение аргументам.
     * @param args
     */
    public static void main (String[] args ) {
        Calculator.plus(100,500);
        Calculator.plus(4,2);
        Calculator.plus(3,5);
    }

    /**
     * Method plus.
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
}
