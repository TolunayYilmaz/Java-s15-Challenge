package org.example;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class FacultyOfficer extends  memberRecord{
    public FacultyOfficer(TreeMap<Integer, Book> books, String name, int id, String type, Date dateOfMemberShip, boolean noBooksIssued, int maxBookLimit, String address, String phoneNo) {
        super(books, name, id, type, dateOfMemberShip, noBooksIssued, maxBookLimit, address, phoneNo);
    }
}
