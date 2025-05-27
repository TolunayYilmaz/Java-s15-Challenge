package org.example;
import org.example.interfaces.IBookFactory;

import java.util.HashMap;
import java.util.Map;

public class Library extends BaseBook implements IBookFactory {

    private  Map<Integer, Reader> readers;

    public Library(Map<Integer, Reader> readers,Map<Integer,Book> books) {
        this.readers=readers;
        this.books=books;
        if(this.books==null){
            this.books = new HashMap<>();
        }
        if(this.readers==null){
            this.readers=  new HashMap<>();
        }


    }

    public void getBooks(){

        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            System.out.println(book.display());  // display() String döndürüyor ve onu yazdırıyoruz
        }

    }
    public void getReader(){

        for (Map.Entry<Integer, Reader> entry : readers.entrySet()) {
            Reader reader = entry.getValue();
            System.out.println(reader.name);
        }

    }

    public Map<Integer, Reader> getReaders() {
        return readers;
    }

    public void newBook(Book book){
     books.put(book.getBook_ID(),book);
    }
    public Book lendBook(int id){
       Book book= books.get(id);
       books.remove(id);
       return book;

    }
    public void takeBackBook(Book book){
     this.books.put(book.getBook_ID(),book);
    }

}
