package com.algorithms.part1;

import java.util.HashMap;
import java.util.Map;

public class SimilarStrings {

    /**
     * Method checks if there are same amount of characters in two strings
     * @param s1 String one
     * @param s2 String two
     * @return True if string are string similar
     * */
    public static boolean isSimilar(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();

        int size1 = s1.length();
        int size2 = s2.length();

        if (size1 != size2) return false;

        for (int i = 0; i < size1; i++) {
            if (map1.get(s1.charAt(i)) == null) {
                map1.put(s1.charAt(i), 1);
            } else {
                int k = map1.get(s1.charAt(i));
                k++;
                map1.put(s1.charAt(i), k);
            }
        }

        for (int i = 0; i < size2; i++) {
            if (map2.get(s1.charAt(i)) == null) {
                map2.put(s1.charAt(i), 1);
            } else {
                int k = map2.get(s1.charAt(i));
                k++;
                map2.put(s1.charAt(i), k);
            }
        }

        for (Map.Entry<Character, Integer> pair : map1.entrySet()) {
            Character i = pair.getKey();
            int j = pair.getValue();

            if (map2.get(i) != j) return false;
        }

        return true;
    }
}
