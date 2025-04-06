package atm;

public class Account {
    private String accountNumber;
    private double totalBalance;
    private double availableBalance;

    protected Account(String accountNumber, double totalBalance, double availableBalance) {
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
    }

    protected String getAccountNumber() {
        return this.accountNumber;
    }
    protected double getTotalBalance() {
        return this.totalBalance;
    }
    protected double getAvailableBalance() {
        return this.availableBalance;
    }

    protected void debit(double amount) {
        this.totalBalance -= amount;
    }
    protected void credit(double amount) {
        this.totalBalance += amount;
    }
}
