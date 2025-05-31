package service;
import modal.MemberRecord;
import repository.BookRepository;

public class MemberRepositoryService extends ReaderService{

    private MemberRecord memberRecord;
    public MemberRepositoryService(BookRepository bookRepository, MemberRecord memberRecord) {
        super(bookRepository, memberRecord);
        this.memberRecord=memberRecord;
    }

    public MemberRepositoryService(MemberRecord memberRecord) {
        super(memberRecord);
    }

    public void getMember(){

        System.out.println(memberRecord.getName()+" "+memberRecord.getPhoneNo());
    }
    public void incBookIssued(){
      int maxBookLimit=  memberRecord.getMaxBookLimit();
        maxBookLimit+=1;
        memberRecord.setMaxBookLimit(maxBookLimit);
    }
    public void decBookIssued(){
        int maxBookLimit=  memberRecord.getMaxBookLimit();
        if (maxBookLimit>0){
            maxBookLimit-=1;
        }
        memberRecord.setMaxBookLimit(maxBookLimit);
    }
    public void payBill(double amount){
        double  thisAmount=  memberRecord.getAmount();
        thisAmount+=amount;
        memberRecord.setAmount(thisAmount);

    }
   public int getMaxBookLimit(){
      return  memberRecord.getMaxBookLimit();
   }
    public double getAmount() {
        return memberRecord.getAmount();
    }

    @Override
    public String whoyouare() {
        return memberRecord.getName();
    }
}
