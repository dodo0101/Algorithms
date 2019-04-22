package com.algorithms.part1;

public class OriginalSymbols {

    /**
     * Method checks if there are only unique chars in string
     * @param s String
     * @return true if only unique chars in s
     * */
    public static boolean checkString(String s) {
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            if (s.indexOf(ch[i], i + 1) != -1) {
                return false;
            }
        }
        return true;
    }

}
