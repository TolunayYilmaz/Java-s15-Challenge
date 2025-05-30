package modal;

import utils.enums.Status;
import utils.interfaces.Identify;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Identify {


    private int book_ID;
    private Author author;
    private  String name;
    private double price;
    private Status status;
    private byte edition;
    private Date date_of_purchase;

    private String owner;


    public Book(int book_ID, String name, double price, byte edition, Date date_of_purchase, Author author) {
        this.book_ID = book_ID;
        this.name = name;
        this.price = price;
        this.status =Status.Library;
        this.edition = edition;
        this.date_of_purchase = date_of_purchase;
        this.author = author;

    }


    public int getID() {
        return book_ID;
    }
    public String getAuthor() {
        return author.getName();
    }

    public String getTitle() {
        return name;
    }

    public String getOwner(){
        return owner;
    }
    public void changeOwner(String owner){
        if(this.owner != null){
            this.owner=owner;
        }

    }
    public void updateStatus(Status status){
        if(this.status!=null){
            this.status=status;
        }
    }

    public String display(){
        if(this==null) {
            return "Böyle bir kitabın görüntüsü oluşturulmamaktadır";
        }
        else{
            return "Title: "+name+" Author: "+author.getName()+" Price: "+price;
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);//Listelerde name göre sıralar
    }
}