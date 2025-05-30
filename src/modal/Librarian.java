package modal;

import java.lang.reflect.Member;
import java.util.Map;

public class Librarian extends Person

 {
     private String password;
     private Library library;

     public Librarian( String name, String password, Library library) {
         super(name);
         this.password = password;
         this.library = library;
     }



}
