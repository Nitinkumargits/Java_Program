class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    // Parameterise constructor
    public Account(String acc, String n, String add, String phno, String dob, long balance) {
        accNo = acc;
        name = n;
        this.dob = dob;
        setAddress(add);
        setPhno(phno);
        balance = 0;
    }

    // Getter method
    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getphno() {
        return phno;
    }

    public String getDoB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    // setter method
    public void setAddress(String add) {
        address = add;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

}

class SavingAccount extends Account {
    public long balance;

    public void deposite(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}

/**
 * InneraccountInheritance
 */
public class loanAccount extends Account {
    public void payEMI(long amt) {
        balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt) {
            balance = 0;
        }
    }

}

/**f
 * accountInheritance
 */
public class accountInheritance {

    public static void main(String[] args) {

        Account a = new Account(104, "Nitin", "dwarka", 1234567890, "18/5/2000", 59999999);
        System.out.println(a.getAccNo());
    }
}