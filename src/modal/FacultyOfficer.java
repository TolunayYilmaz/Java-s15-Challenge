package modal;
import java.util.Date;
import java.util.List;
public class FacultyOfficer extends  MemberRecord{
    public FacultyOfficer(String name, int id, List<Book> books) {
        super(name,id,books);
    }
    public FacultyOfficer(String name, int id, String type, Date dateOfMemberShip, boolean noBooksIssued, int maxBookLimit, String address, String phoneNo, double amount,List<Book> books) {
        super(name, id, type, dateOfMemberShip, noBooksIssued, maxBookLimit, address, phoneNo, amount,books);
    }
}
