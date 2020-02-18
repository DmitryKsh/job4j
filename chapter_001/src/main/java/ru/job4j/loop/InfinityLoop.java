package ru.job4j.loop;

public class InfinityLoop {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println("infinity");
            index = index + 1;  // Из-за этого оператора (index = index - 1;) цикл повторяется вечно.
                                // Его нужно заменить на сложение или же закомментировать т.к. он здесь не совсем уместен.
        }
    }
}
