package org.example;

import java.util.Map;
import java.util.TreeMap;

public abstract class Person extends BaseBook {
    protected String name;
    public Person(TreeMap<Integer, Book> books, String name) {
        super(books);
        this.name = name;
    }


    protected abstract String whoyouare();
}
