public class BankInterest {

    String Account_Number;
    String AccountHolder_Name;
    double balance;

    BankInterest(){}

    public BankInterest(String account_Number, String accountHolder_Name, double balance) {
        Account_Number = account_Number;
        AccountHolder_Name = accountHolder_Name;
        this.balance = balance;
    }

    public String getAccount_Number() {
        return Account_Number;
    }

    public void setAccount_Number(String account_Number) {
        Account_Number = account_Number;
    }

    public String getAccountHolder_Name() {
        return AccountHolder_Name;
    }

    public void setAccountHolder_Name(String accountHolder_Name) {
        AccountHolder_Name = accountHolder_Name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankInterest [Account_Number=" + Account_Number + ", AccountHolder_Name=" + AccountHolder_Name
                + ", balance=" + balance + "]";
    }

    




    
}
