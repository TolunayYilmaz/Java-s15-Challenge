package org.example;

import java.util.Date;

public class Journals extends Book {
    public Journals(int book_ID, String name, double price, byte edition, Date date_of_purchase, Author author) {
        super(book_ID, name, price, edition, date_of_purchase, author);
    }
}
