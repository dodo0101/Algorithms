package com.algorithms.part2;

import java.text.Collator;
import java.util.*;

public class DuplicateDelete {

    /**
     * Method modifies linkedlist by deleting duplicates
     * @param list list to modify
     * @return modified list
     * */
    static LinkedList<String> dupDelete(LinkedList<String> list) {

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Collator.getInstance().compare(o1, o2);
            }
        });

        LinkedList<String> result = new LinkedList<String>();

        for (int i = 0; i < list.size() - 1; i++) {
            if (!list.get(i).equals(list.get(i+1))) result.add(list.get(i));
        }

        return result;
    }




}
