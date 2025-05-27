import org.example.Author;
import org.example.Book;
import org.example.Library;
import org.example.Reader;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        //Author Book ilişkisi
//        Author author = new Author("Tolunay");
//        author.newBook(1,new Book(1L,"80 gün",50.0,(byte)1,new Date()));
//        System.out.println(author.whoyouare());
//        System.out.println(author.showBook(1).getTitle());
//        System.out.println(author.showBook(1).display());
//        System.out.println(author.showBook(1).getAuthor());

        //Library ilişkisi
        Map<Integer,Book> books= new HashMap<>();
        Map<Integer, Reader> readers= new HashMap<>();

        books.put(1,new Book(1,"80 gün",50.0,(byte)1,new Date(),new Author("Tolunay")));
        books.put(2,new Book(2,"90 gün",60.0,(byte)1,new Date(),new Author("Fahri")));
        books.put(3,new Book(3,"100 gün",45,(byte)1,new Date(),new Author("Ayşe")));
        readers.put(1,new Reader("Ömer"));
        readers.put(2,new Reader("Furkan"));

        Library library= new Library(readers,books);
        library.newBook(new Book(4,"110 gün",20,(byte)1,new Date(),new Author("Fatma")));
        library.getBooks();
        library.getReader();


        readers.get(1).borrowBook(library.lendBook(1));
        System.out.println("Kitap Sahibi: "+readers.get(1).whoyouare()+"--Aldığı Kitap Bilgileri--> "+ readers.get(1).showBook(1).display());//kitapo göster
        library.getBooks();
        System.out.println("------------");
        System.out.println("Kitap Sahibi: "+readers.get(1).whoyouare()+"--Aldığı Kitap Bilgileri--> "+ readers.get(1).showBook(1).display());
        System.out.println("------------");
        library.takeBackBook(readers.get(1).returnBook(1));//kütüphane iade
        try {
            System.out.println(readers.get(1).showBook(1).display());//kitap göster
        } catch (RuntimeException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        System.out.println("Kütüphane güncel");
        library.getBooks(); //kütüphane güncel liste

    }
}