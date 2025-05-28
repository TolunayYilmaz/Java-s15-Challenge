package org.example;
import org.example.interfaces.IBookFactory;

import java.util.*;

public class Library extends BaseBook implements IBookFactory {

    private  Map<Integer, Reader> readers;

    public Library(TreeMap<Integer, Book> books, Map<Integer, Reader> readers) {
        super(books);
        this.readers = readers;
            if(super.books==null){
                super.books = new TreeMap<>();
            }
            if(this.readers==null){
                this.readers=  new HashMap<>();
            }

    }

    public void getBooks(){

        for (Book book: books.values()) {

            System.out.println(book.display());  // display() String döndürüyor ve onu yazdırıyoruz
        }

    }
    public TreeSet<Book> getBooksComparetoName() {
        return new TreeSet<>(books.values());
    }
    public void getReadersPrint(){

        for (Reader reader : readers.values()) {

            System.out.println(reader.name);
        }

    }

    public Map<Integer, Reader> getReaders() {
        return Collections.unmodifiableMap(readers);
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
    public void newReaders(memberRecord member){
        readers.put(member.getId(),member);
    }

}
