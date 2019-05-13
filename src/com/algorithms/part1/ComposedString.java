package com.algorithms.part1;

public class ComposedString {
    
    /**
     * Method modifies string if its modified size smaller
     * @param s string to modify
     * @return new string (or old one)
     * */
    public static String compose(String s) {

        char[] ch = s.toCharArray();
        int length = ch.length;
        int n = 1;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < length - 1; i++) {
            char c = ch[i];
            if (ch[i + 1] == c) {
                n++;
            } else {
                str.append(c);
                str.append(n);
                n = 1;
            }

            if (i == length - 2 && ch[i + 1] == c) {
                str.append(c);
                str.append(n);
            } else if (i == length - 2 && ch[i + 1] != c) {
                str.append(c);
                str.append(n);
                str.append(ch[i + 1]);
                str.append(1);
            }
        }
        if (str.length() < s.length()) {
            s = str.toString();
        }
        return s;
    }
}
