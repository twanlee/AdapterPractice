package com.codegym;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet .add(1);
        mySet .add(2);
        mySet .add(2);
        mySet .add(5);
        mySet .add(5);
//        CollectionUtilsAdapter collectionUtilsAdapter = new CollectionUtilsAdapter();
        CollectionUtils collectionUtils = new CollectionUtils();
//        int max = collectionUtils.findMax(collectionUtilsAdapter.collectionAdapter(mySet));
//        System.out.println(max);
        Client client = new Client(collectionUtils);
        client.printMaxValue(mySet);
    }
}
