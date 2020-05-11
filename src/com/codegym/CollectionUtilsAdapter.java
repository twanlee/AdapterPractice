package com.codegym;

import java.util.*;

public class CollectionUtilsAdapter {
    List<Integer> collectionAdapter(Set<Integer> set) {
        List<Integer> list = new ArrayList<>();
        for (Integer element : set
        ) {
            list.add(element);
        }
        return list;
    }
}
