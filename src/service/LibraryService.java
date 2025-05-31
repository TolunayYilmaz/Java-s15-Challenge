package service;

import modal.Book;
import modal.MemberRecord;
import modal.Reader;
import repository.BookRepository;
import repository.ReaderRepository;

import java.util.*;

public class LibraryService {
    private BookRepository bookRepository;
    private ReaderRepository readerRepository;

    public LibraryService(BookRepository bookRepository, ReaderRepository readerRepository) {

        this.bookRepository=bookRepository;
        this.readerRepository=readerRepository;
        if(bookRepository==null){
            this.bookRepository=new BookRepository();
        }

        if(readerRepository==null){
            this.readerRepository=new ReaderRepository();
        }

    }


    public TreeSet<Book> getBooksComparetoName() {
        return new TreeSet<>(bookRepository.getAll());
    }
    public void getReadersPrint(){

        for (Reader reader : readerRepository.getAll()) {

            System.out.println(reader.getName());
        }

    }

    protected List<MemberRecord> getReaders() {
        return readerRepository.getAll();
    }
    public List<Book> getBooks() {
        return Collections.unmodifiableList(bookRepository.getAll());
    }
    public void newBook(Book book){
       bookRepository.create(book);
    }
    public Book lendBook(int id){
        Book book= bookRepository.getById(id);
        bookRepository.delete(id);
        return book;

    }
    public void takeBackBook(Book book,String status){
        newBook(book);
        this.bookRepository.getById(book.getID()).updateStatus(status);
    }
    public void newReaders(MemberRecord member){
        readerRepository.create(member);
    }


}
