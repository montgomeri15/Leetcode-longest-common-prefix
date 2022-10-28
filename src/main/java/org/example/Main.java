package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        String lastWord = null;
        if (s.length() > 0) {
            s = s.trim();
            lastWord = s.substring(s.lastIndexOf(" ") + 1);
        }
        return lastWord.length();
    }
}

