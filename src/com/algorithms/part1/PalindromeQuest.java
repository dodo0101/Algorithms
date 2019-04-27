package com.algorithms.part1;

import java.util.HashMap;
import java.util.Map;

public class PalindromeQuest {

    /**
     * Method checks if there is palindrome in string
     * @param s String to check
     * @return True if string is a palindrome
     * */
    public static boolean palindrome(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        s = s.toLowerCase();

        int size = s.length();
        if (size <= 2) return false;

        for (int i = 0; i < size; i++) {
            if (map.get(s.charAt(i)) == null && s.charAt(i) != ' ') {
                map.put(s.charAt(i), 1);
            } else if (s.charAt(i) != ' '){
                int k = map.get(s.charAt(i));
                k++;
                map.put(s.charAt(i), k);
            }
        }

        int n = 0;

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            int j = pair.getValue();
            if (j == 1) n++;
        }

        return n > 1 ? false : true;
    }
}
