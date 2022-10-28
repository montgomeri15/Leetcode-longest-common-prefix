package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String pref = strs[0];
        for (int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(pref) != 0){
                pref = pref.substring(0, pref.length()-1);
            }
        }
        return pref;
    }
}

