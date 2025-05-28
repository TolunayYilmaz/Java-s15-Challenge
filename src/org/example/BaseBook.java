package org.example;

import java.util.Map;
import java.util.TreeMap;

public abstract class BaseBook {
    protected TreeMap<Integer,Book> books;

    public BaseBook(TreeMap<Integer, Book> books) {
        this.books = books;
    }

    public Book showBook(int id){
        if (books.get(id) == null) {
            throw new RuntimeException("Böyle bir kitap bulunamamaktadır");
        }
        return books.get(id);
    }

}
