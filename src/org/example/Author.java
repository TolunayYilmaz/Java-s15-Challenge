package org.example;

import org.example.interfaces.IBookFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Author extends Person implements IBookFactory {


    public Author(String name) {
        super(new TreeMap<>(), name);
    }

    @Override
    public String whoyouare() {
        return name;
    }
    public void newBook(Book book){
        if(books == null){
            this.books=new TreeMap<>();
        }
        books.put(book.getBook_ID(), book);
    }

 public TreeMap<Integer,Book> getBooks(){

        return this.books;
 }
}
