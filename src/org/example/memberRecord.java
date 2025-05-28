package org.example;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class memberRecord extends Reader
 {
    private int id;
    private String type;
    private Date dateOfMemberShip;
    private  boolean noBooksIssued;
    private int maxBookLimit;
    private String address;
    private String phoneNo;
    private double amount;



     public memberRecord(TreeMap<Integer, Book> books, String name, int id, String type, Date dateOfMemberShip, boolean noBooksIssued, int maxBookLimit, String address, String phoneNo) {
         super(books, name);
         this.id = id;
         this.type = type;
         this.dateOfMemberShip = dateOfMemberShip;
         this.noBooksIssued = noBooksIssued;
         this.maxBookLimit = maxBookLimit;
         this.address = address;
         this.phoneNo = phoneNo;
     }

     public memberRecord(String name) {
         super(new TreeMap<>(),name);
     }

     public void getMember(){

         System.out.println(this.name+" "+this.phoneNo);
     }
     public void incBookIssued(){
         maxBookLimit++;
     }
     public void decBookIssued(){
         maxBookLimit--;
     }
     public void payBill(double amount){
         this.amount += amount;
     }

     public int getId() {
         return id;
     }

     public double getAmount() {
         return amount;
     }
 }
