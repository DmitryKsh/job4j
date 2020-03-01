package ru.job4j.array;

/**
 *
 *  input = {4, 1, 6, 2};
 *
 *  expect = {2, 6, 1, 4};
 *
 */

public class Turn {
    public static int[] back(int[] array) {
        for ( int index = 0; index < array.length / 2; index++) {
            int temp = array[array.length - index - 1];
            array[array.length - index - 1] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
