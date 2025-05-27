package org.example;

import org.example.interfaces.IBookFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Author extends Person implements IBookFactory {


    public Author(String name) {
        super.name=name;
    }

    @Override
    public String whoyouare() {
        return name;
    }
    public void newBook(Book book){
        if(books == null){
            this.books=new HashMap<>();
        }
        books.put(book.getBook_ID(), book);
    }


}
