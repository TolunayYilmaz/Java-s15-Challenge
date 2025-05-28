package org.example;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Student extends memberRecord {
    public Student(TreeMap<Integer, Book> books, String name, int id, String type, Date dateOfMemberShip, boolean noBooksIssued, int maxBookLimit, String address, String phoneNo) {
        super(books, name, id, type, dateOfMemberShip, noBooksIssued, maxBookLimit, address, phoneNo);
    }
}
