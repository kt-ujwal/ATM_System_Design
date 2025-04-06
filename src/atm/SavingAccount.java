package atm;

public class SavingAccount extends Account {
    private double withdrawalLimit;

    public SavingAccount(String accountNumber, double withdrawalLimit, double totalBalance, double availableBalance) {
        super(accountNumber, totalBalance, availableBalance);
        this.withdrawalLimit = withdrawalLimit;
    }
}
