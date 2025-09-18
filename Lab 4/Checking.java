public class Checking extends Account{
    Checking(double checkingBalance){
        new Account(checkingBalance);
    }

    @Override
    public void withdrawal(double checkWithdrawal){
        double checkingAmount;
        double checkingBalance = getAccountBalance();
        final int withdrawalAmount = 20;
        checkingAmount = (checkingBalance - checkWithdrawal);
        if(checkingAmount < 0){
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            checkWithdrawal = (checkWithdrawal + withdrawalAmount);
        }
        checkingAmount = checkingBalance - checkWithdrawal;
        setAccountBalance(checkingAmount);
    }
}
