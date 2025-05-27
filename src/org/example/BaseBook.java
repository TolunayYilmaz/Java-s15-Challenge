package org.example;

import java.util.Map;

public abstract class BaseBook {
    protected Map<Integer,Book> books;
    public Book showBook(int id){
        if (books.get(id) == null) {
            throw new RuntimeException("Böyle bir kitap bulunamamaktadır");
        }
        return books.get(id);
    }

}
