package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0){
            return false;
        }
        String cleanString = s.replaceAll("\\p{Punct}|\\p{Space}", "").toLowerCase();
        String reverseString = new StringBuilder(cleanString).reverse().toString();
        return cleanString.equals(reverseString);
    }
}

