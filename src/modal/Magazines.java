package modal;



import utils.enums.Category;

import java.util.Date;

public class Magazines extends Book{

    public Magazines(int book_ID, String name, double price, byte edition, Date date_of_purchase, Author author) {
        super(book_ID,Category.Magazines, name, price, edition, date_of_purchase, author);
    }
}
