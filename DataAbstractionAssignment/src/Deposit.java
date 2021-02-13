import java.sql.Date;


public class Deposit {
    private double amount;
    private Date date;
    private String account;

    public void setDeposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
        //your code here
        if (account == "Checking")
            return "Deposit of: $" + amount + " " + date + " into account: Checking";
        if (account == "Saving")
            return "Deposit of: $" + amount + " " + date + " into account: Saving";
        return "";
    }
}
