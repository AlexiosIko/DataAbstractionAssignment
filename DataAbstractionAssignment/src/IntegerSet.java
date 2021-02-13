import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class IntegerSet {
    ArrayList<Integer> nums = new ArrayList<>();

    public void insert(Integer num) {
        nums.add(num);
    }

    public int size() {
        return nums.size();
    }

    public boolean contains(Integer num) {
        return nums.contains(num);
    }

    @Test
    public void depositTest() {
        Date date = new Date(System.currentTimeMillis());
        Deposit deposit = new Deposit();
        deposit.setDeposit(1500, date, "Checking");
        assertEquals("Deposit of: $1500.0 " + new Date(System.currentTimeMillis()) + " into account: Checking", deposit.toString());
    }
    @Test
    public void withdrawTest() {
        Date date = new Date(System.currentTimeMillis());
        Withdraw withdraw = new Withdraw();
        withdraw.setWithdraw(2000, date, "Saving");
        assertEquals("Withdraw of: $2000.0 " + date + " out of account: Saving", withdraw.toString());
    }
    @Test
    public void customerDeposit() {
        Date date = new Date(System.currentTimeMillis());
        Customer customer = new Customer();
        customer.deposit(20, date, "Checking");
        assertEquals(20.0, customer.getCheckBalance(), 0);
    }

    @Test
    public void customerWithdraw() {
        Date date = new Date(System.currentTimeMillis());
        Customer customer = new Customer();
        customer.withdraw(50, date, "Saving");
        assertEquals(-50, customer.getSavingBalance(),0 );
    }
}
