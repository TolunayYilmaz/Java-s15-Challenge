package service;

import modal.Book;
import modal.MemberRecord;
import modal.Reader;
import repository.BookRepository;
import repository.ReaderRepository;

public class LibrarianService {

    private  LibraryService libraryService;

    public LibrarianService(LibraryService libraryService) {
      this.libraryService=libraryService;
    }

    public void searchBook(int bookId){
        System.out.println("Bulunan Kitap: "+libraryService.getBooks().get(bookId).display());
    }
    public void verifyMember(MemberRecord member){
        libraryService.newReaders(member);
    }
    public int issueBook(){
        return libraryService.getBooks().size();
    }
    public double calculateFine(int day,int userId){
        double sum=0;
        for (Book book :libraryService.getReaders().get(userId).getBooks()){
            sum += book.getPrice() * day * 0.1 + book.getPrice();
        }
        return sum;
    }
    public void createBill(MemberRepositoryService member, int bookId){
        Book book =libraryService.lendBook(bookId);
        member.payBill(book.getPrice());
        member.purchaseBook(book);
    }
    public void returnBook(Book book) {
        libraryService.takeBackBook(book);
    }

}
