package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public abstract class Reader extends Person {

    public Reader(TreeMap<Integer, Book> books, String name) {
        super(books, name);
    }

    @Override
    public String whoyouare() {
        return super.name;
    }

    public Book returnBook(int id){
     Book resultBook=this.books.get(id);
     this.books.remove(id);
     return resultBook;
    }
    public void borrowBook(Book book){
    this.books.put(book.getBook_ID(),book);
    }

    public void purchaseBook(Book book){
        this.books.put(book.getBook_ID(),book);
    }

}
