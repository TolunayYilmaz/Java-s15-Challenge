package org.example;

import java.lang.reflect.Member;
import java.util.Map;

public class Librarian extends Person

 {
     private String password;
     private Library library;

     public Librarian( String name, String password, Library library) {
         super(library.books, name);
         this.password = password;
         this.library = library;
     }

     @Override
    protected String whoyouare() {
        return this.name;
    }

     public void searchBook(int bookId){
       System.out.println(library.books.get(bookId).display());
     }
     public void verifyMember(memberRecord member){
      library.newReaders(member);
     }
     public int issueBook(){
       return library.books.size();
     }
     public double calculateFine(int day,int userId){
         double sum=0;
      for (Book book :library.getReaders().get(userId).books.values()){
         sum= book.getPrice()*day*0.1+book.getPrice();
      }
      return sum;
     }
     public void createBill(memberRecord member,int bookId){
       Book book =library.lendBook(bookId);
       member.payBill(book.getPrice());
       member.purchaseBook(book);
     }
     public void returnBook(int id){
       library.lendBook(id);
     }
}
