package com.algorithms.part1;

public class ReplaceSpace {

    /**
     * Method modify string by changing space to '%20' symbols on current size n
     * @param s String to modify
     * @param n Result string size
     * @return Modified string
     * */
    public static String changeString(String s, int n) {
        s = s.substring(0, n);
        return s = s.replaceAll("\\s+", "%20");
    }
}
