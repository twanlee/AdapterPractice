package com.codegym;

import java.util.Set;

public class Client {
    private CollectionUtils collectionUtils;

    public Client(CollectionUtils collectionUtils) {
        this.collectionUtils = collectionUtils;
    }

    public Client() {

    }

    public void printMaxValue(Set<Integer> numbers) {
        CollectionUtilsAdapter collectionUtilsAdapter = new CollectionUtilsAdapter();

        int max = collectionUtils.findMax(collectionUtilsAdapter.collectionAdapter(numbers));
        System.out.println("Max value is: " + max);
    }
}
