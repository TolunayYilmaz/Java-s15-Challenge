import org.example.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Author author =new Author("Selami");
        author.newBook((new Book(4,"Harry Potter",50.0,(byte)1 ,new Date(),author)));
        author.newBook((new Book(2,"Felek",50.0,(byte)1 ,new Date(),author)));
        author.newBook((new Book(1,"Melek",50.0,(byte)1 ,new Date(),author)));
        author.newBook((new Book(3,"Game of Thrones",50.0,(byte)1 ,new Date(),author)));

        Author author2 =new Author("Ahmet");
        author2.newBook((new Book(7,"The Walking Dead",50.0,(byte)1 ,new Date(),author2)));
        author2.newBook((new Book(5,"Dark",50.0,(byte)1 ,new Date(),author2)));
        author2.newBook((new Book(0,"Zed",50.0,(byte)1 ,new Date(),author2)));
        author2.newBook((new Book(6,"Oyuncak Mezarlığı",50.0,(byte)1 ,new Date(),author2)));
        author2.newBook((new Book(10,"Ağıl",50.0,(byte)1 ,new Date(),author2)));


        for (Book book:author.getBooks().values()) {
        System.out.println(book.display());
        }
        System.out.println("-----------");
        for (Book book:author2.getBooks().values()) {
            System.out.println(book.display());
        }
        Student student= new Student(new TreeMap<Integer,Book>(),"Tolunay",1,"Ogrenci",new Date(),true,10,
        "İstanbul","532");
        Student student2= new Student(new TreeMap<Integer,Book>(),"Fahri",2,"Ogrenci",new Date(),true,10,
                "İstanbul","532");
        Student student3= new Student(new TreeMap<Integer,Book>(),"Necibe",3,"Ogrenci",new Date(),true,10,
                "İstanbul","532");
        TreeMap<Integer,Book> books=new TreeMap<>();
        books.putAll(author.getBooks());
        books.putAll(author2.getBooks());


        Map<Integer,Reader> readers=new HashMap<>();
        readers.put(student.getId(),student);
        readers.put(student2.getId(),student2);
        readers.put(student3.getId(),student3);

        Library library=new Library(books,readers);
        System.out.println(" Kütüphanedeki Kitaplar-----------");
        library.getBooks();
        System.out.println(" Kütüphanedeki Okuyucular-----------");
        for (Reader reader:library.getReaders().values()){
            System.out.println(reader.whoyouare());
        }

        Librarian huysuzGorevli=new Librarian("Saadet","123456",library);
        huysuzGorevli.searchBook(6);
        Student student4= new Student(new TreeMap<Integer,Book>(),"Varol",4,"Ogrenci",new Date(),true,10,
                "İstanbul","532");
        huysuzGorevli.verifyMember(student4);
        library.getReadersPrint();


        System.out.println(" Kütüphanedeki Kitap Sayısı-----------");
        System.out.println(huysuzGorevli.issueBook());

        huysuzGorevli.createBill(student4,2);
        System.out.println("Öğrencinin Harcağı Fiyat "+student4.getAmount());
        huysuzGorevli.createBill(student4,3);
        System.out.println("Öğrencinin Harcağı Fiyat "+student4.getAmount());

        System.out.println("Üye bilgi");
        student4.getMember();

        System.out.println("İsime göre sırlaı kitaplar");
        for (Book book:  library.getBooksComparetoName()){

            System.out.println(book.display());
        }


    }
}