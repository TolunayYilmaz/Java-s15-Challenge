package modal;

import java.util.Date;
import java.util.List;
import java.util.TreeMap;

public abstract class MemberRecord extends Reader{

    private String type;
    private Date dateOfMemberShip;
    private  boolean noBooksIssued;
    private int maxBookLimit;
    private String address;
    private String phoneNo;
    private double amount;


    public MemberRecord(String name, int id, List<Book> books) {
        super(name,id,books);
    }

    public MemberRecord(String name, int id, String type, Date dateOfMemberShip, boolean noBooksIssued, int maxBookLimit, String address, String phoneNo, double amount,List<Book> books) {
        super(name,id,books);

        this.type = type;
        this.dateOfMemberShip = dateOfMemberShip;
        this.noBooksIssued = noBooksIssued;
        this.maxBookLimit = maxBookLimit;
        this.address = address;
        this.phoneNo = phoneNo;
        this.amount = amount;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateOfMemberShip() {
        return dateOfMemberShip;
    }

    public void setDateOfMemberShip(Date dateOfMemberShip) {
        this.dateOfMemberShip = dateOfMemberShip;
    }

    public boolean isNoBooksIssued() {
        return noBooksIssued;
    }

    public void setNoBooksIssued(boolean noBooksIssued) {
        this.noBooksIssued = noBooksIssued;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public void setMaxBookLimit(int maxBookLimit) {
        this.maxBookLimit = maxBookLimit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
