package service;

import modal.Author;
import modal.Book;
import modal.Reader;
import repository.BookRepository;

public class ReaderService extends PersonService{
    private BookRepository bookRepository;
    private Reader reader;
    public ReaderService(BookRepository bookRepository, Reader reader) {
        this.bookRepository=bookRepository;
    }
    public ReaderService(Reader reader) {
         this.reader=reader;
    }

    public Book returnBook(int id){
        Book resultBook=this.bookRepository.getById(id);
        this.bookRepository.delete(id);
        return resultBook;
    }
    public void borrowBook(Book book){
        bookRepository.create(book);
    }

    public void purchaseBook(Book book){
       bookRepository.create(book);
    }

    public Reader getReader() {
        return reader;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    @Override
    public String whoyouare() {
        return  this.getReader().getName();
    }
}
