package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int index = post.length-1; index >= 0; index--) {
            if ( result == true) {
                result = true;
                break;
            } else {
                result = false;
            }
            for (int i = word.length-1; i >= 0; i--) {
                if ( post[index] == word[i]) {
                    result = true;
                    break;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
