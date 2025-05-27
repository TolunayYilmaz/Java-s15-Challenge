package org.example;

import org.example.enums.Status;

import java.util.Date;

public class Book {


    private int book_ID;
    private Author author;
    private  String name;
    private double price;
    private Status status;
    private byte edition;
    private Date date_of_purchase;

    private String owner;


    public Book(int book_ID, String name, double price, byte edition, Date date_of_purchase,Author author) {
        this.book_ID = book_ID;
        this.name = name;
        this.price = price;
        this.status =Status.Library;
        this.edition = edition;
        this.date_of_purchase = date_of_purchase;
        this.author = author;

    }


    public int getBook_ID() {
        return book_ID;
    }
    public String getAuthor() {
        return author.name;
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
           return "Title: "+name+" Author: "+author.name+" Price: "+price;
       }
    }

}
