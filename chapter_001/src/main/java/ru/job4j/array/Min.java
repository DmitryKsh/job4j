package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for ( int index = 0; index < array.length; index++) {
            if ( min > array[index]){
                int temp = array[index];
                array[index] = array[0];
                array[0] = temp;
                min = temp;
            }
            if ( min < array[index] ) {
                int temp = array[0];
                array[0] = array[index];
                array[index] = temp;
            }
        }
        return min;
    }
}
