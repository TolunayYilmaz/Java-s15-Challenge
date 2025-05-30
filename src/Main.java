import modal.*;
import repository.BookRepository;
import repository.ReaderRepository;
import service.AuthorService;
import service.LibrarianService;
import service.LibraryService;
import service.MemberRepositoryService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Author author =new Author("Selami");
        AuthorService authorService= new AuthorService(new BookRepository(),author);
        Book book1 = new Book(4,"Harry Potter",50.0,(byte)1 ,new Date(),author);
        Book book2=new Book(2,"Felek",50.0,(byte)1 ,new Date(),author);
        Book book3 =new Book(1,"Melek",50.0,(byte)1 ,new Date(),author);
        Book book4=new Book(3,"Game of Thrones",50.0,(byte)1 ,new Date(),author);
        authorService.newBook(book1);
        authorService.newBook(book2);
        authorService.newBook(book3);
        authorService.newBook(book4);
        Author author2 =new Author("Ahmet");
        AuthorService authorService2= new AuthorService(new BookRepository(),author);
        authorService2.newBook((new Book(7,"The Walking Dead",50.0,(byte)1 ,new Date(),author2)));
        authorService2.newBook((new Book(5,"Dark",50.0,(byte)1 ,new Date(),author2)));
        authorService2.newBook((new Book(0,"Zed",50.0,(byte)1 ,new Date(),author2)));
        authorService2.newBook((new Book(6,"Oyuncak Mezarlığı",50.0,(byte)1 ,new Date(),author2)));
        authorService2.newBook((new Book(10,"Ağıl",50.0,(byte)1 ,new Date(),author2)));

       System.out.println(authorService.showBook(2).display());


        List<Book> books = new ArrayList<>();
        books.addAll(authorService.getAllBooks());
        books.addAll(authorService2.getAllBooks());
        LibraryService library= new LibraryService(new BookRepository(),new ReaderRepository());
        books.stream().forEach(book -> library.newBook(book));

        System.out.println("Kütüphanedeki kitaplar");
        library.getBooks().stream().forEach(book -> System.out.println("-----"+book.display()));

        Student student1 = new Student(
                "Tolunay", 1, "Ogrenci", new Date(), true, 10,
                "İstanbul", "5320000000", 0.0,new ArrayList<Book>()
        );

        Student student2 = new Student(
                "Fahri", 2, "Ogrenci", new Date(), true, 10,
                "İstanbul", "5321111111", 0.0,new ArrayList<Book>()
        );

        Student student3 = new Student(
                "Necibe", 3, "Ogrenci", new Date(), true, 10,
                "İstanbul", "5322222222", 0.0,new ArrayList<Book>()
        );

     library.newReaders(student1);
     library.newReaders(student2);
     library.newReaders(student3);
     LibrarianService huysuz= new LibrarianService(library);
     Student student4 = new Student(
                "Varol", 4, "Ogrenci", new Date(), true, 10,
                "İstanbul", "5322222222", 0.0,new ArrayList<Book>()
        );

     System.out.println("Kütüphane kayıtlı kullanıcılar");
     huysuz.verifyMember(student4);
       library.getReadersPrint();

       MemberRepositoryService memberRepositoryService = new MemberRepositoryService(new BookRepository(),student3);
       huysuz.createBill(memberRepositoryService,7);
       System.out.println("Çıkarılan kitap "+memberRepositoryService.getBookRepository().getById(7).display());

       System.out.println("Kalan Kitaplar");
       library.getBooks().stream().forEach(book -> System.out.println("-----"+book.display()));
        huysuz.searchBook(3);


    }
}

