import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    void setWithdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
        //your code here
        if (account == "Checking")
            return "Withdraw of: $" + amount + " " + date + " out of account: Checking";
        if (account == "Saving")
            return "Withdraw of: $" + amount + " " + date + " out of account: Saving";
        return "";
    }
}
