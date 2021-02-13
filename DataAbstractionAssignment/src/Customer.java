import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;


    public void setCustomer(){
        accountNumber = 0;
        deposits.clear();
        withdraws.clear();
        checkBalance = 0;
        savingBalance = 0;
        savingRate = 0;
        name = "";
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setCustomer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        checkBalance += checkDeposit;
        savingBalance += savingDeposit;
    }

    public void deposit(double amt, Date date, String account){
        //your code here
        System.out.println("Deposit of: $" + amt + " " + date + " into account: " + account);
        if (account == SAVING)
            savingBalance += amt;
        if (account == CHECKING)
            checkBalance += amt;
    }
    public void withdraw(double amt, Date date, String account){
        //your code here
        checkOverdraft(amt, account);
        System.out.println("Withdraw of: $" + amt + " " + date + " into account: " + account);
        if (account == SAVING)
            savingBalance -= amt;
        if (account == CHECKING)
            checkBalance -= amt;
    }
    private boolean checkOverdraft(double amt, String account){
        //your code here
        if (amt + OVERDRAFT < 0)
            return false;
        else
            return true;
    }

    public int getOVERDRAFT() {
        return OVERDRAFT;
    }

    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }
}