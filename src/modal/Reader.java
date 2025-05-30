package modal;
import utils.interfaces.Identify;

import java.util.List;


public abstract class Reader extends Person implements Identify {

    private int userId;
    private List<Book> books;
    public Reader(String name,int userId, List<Book> books) {
        super(name);
        this.books=books;
        this.userId=userId;
    }
    public int getID() {
        return userId;
    }
    public List<Book> getBooks(){
        return books;
    }


}
