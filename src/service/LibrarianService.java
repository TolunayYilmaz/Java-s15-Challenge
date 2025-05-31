package service;

import modal.Author;
import modal.Book;
import modal.MemberRecord;
import modal.Reader;
import repository.BookRepository;
import repository.ReaderRepository;
import utils.enums.Category;

import java.util.List;

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

        if(member.getMaxBookLimit()==0){
            System.out.println("Kitap alamaz "+member.whoyouare());
        }
        else{
            member.decBookIssued();
            Book book =libraryService.lendBook(bookId);
            member.payBill(book.getPrice());
            member.purchaseBook(book);
            System.out.println(bookId+" Kitap satın aldı "+member.whoyouare());
        }

    }
    public void returnBook(MemberRepositoryService member,Book book) {
        member.incBookIssued();
        libraryService.takeBackBook(book,member.whoyouare());

    }
    public List<Book> getCategoryBooks(Category category){

       return libraryService.getBooks().stream().filter(book->book.getCategory()==category).toList();
    }
    public List<Book> getAuthorBooks(Author author){
        return libraryService.getBooks().stream().filter(book -> book.getAuthor().equals(author.getName())).toList();
    }

}
