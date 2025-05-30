package service;

import modal.Author;
import modal.Book;
import repository.BookRepository;

import java.util.List;

public class AuthorService extends PersonService{
   private BookRepository bookRepository;
   private Author author;
    public AuthorService(BookRepository bookRepository,Author author) {
        this.bookRepository=bookRepository;
        this.author = author;
    }

    @Override
    public String whoyouare() {
     return author.getName();
    }

    public Book showBook(int id){

        return bookRepository.getById(id);
    }
    public void newBook(Book book){
        if(book==null){
            throw new IllegalArgumentException("Kitap verisi boş olamaz.");
        }
        bookRepository.create(book);
    }
    public List<Book> getAllBooks(){
     return bookRepository.getAll();
    }
}
