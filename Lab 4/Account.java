public class Account{
    private int accountNumber;
    private static int accountNumNext = 10000;
    private double accountBalance;

    Account(){
        accountBalance = 0;
        accountNumber = accountNumNext;
        accountNumNext++;
    }

    Account(double accountBalance){
        this.accountBalance = accountBalance;
        accountNumber = accountNumNext;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public void withdrawal(double withdrawalA){
        accountBalance = (accountBalance - withdrawalA);
    }

    public void deposit(double depositA){
        accountBalance = (accountBalance + depositA);
    }
}
