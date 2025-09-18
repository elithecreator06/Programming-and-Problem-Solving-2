public class Savings extends Account{
    Savings(double checkingBalance){
        new Account(checkingBalance);
    }

    @Override
    public void withdrawal(double savingWithdrawal){
        double savingsAmount;
        double savingsBalance = getAccountBalance();
        final int withdrawalAmount = 10;
        savingsAmount = (savingsBalance - savingWithdrawal);
        if(savingsAmount < 500){
            System.out.println("Charging a fee of $10 because you are below $500");
            savingWithdrawal = (savingWithdrawal + withdrawalAmount);
        }
        savingsAmount = savingsBalance - savingWithdrawal;
        setAccountBalance(savingsAmount);
    }

    private static int depositTracker = 0;

    @Override
    public void deposit(double savingsDeposit){
        double savingsAmount;
        depositTracker++;
        final int withdrawalFee = 10;
        double savingsBalance = getAccountBalance();
        System.out.println("This is deposit number " + depositTracker + " to this account");
        if(depositTracker >= 6){
            System.out.println("Charging a fee of $10");
            savingsDeposit = (savingsDeposit - withdrawalFee);
        }
        savingsAmount = (savingsBalance + savingsDeposit);
        setAccountBalance(savingsAmount);
    }

    public void interest(){
        double savingsBalance = getAccountBalance();
        final double addingInterest = 0.015;
        double interestAdded = (savingsBalance * addingInterest);
        savingsBalance = (savingsBalance + interestAdded);
        System.out.println("Customer earned " + interestAdded + " in interest");
        setAccountBalance(savingsBalance);
    }
}
