package atm;

public class CheckingAccount extends Account {
    private String cardNumber;
    CheckingAccount(String accountNumber, String cardNumber, double totalBalance, double avaialableBalance) {
        super(accountNumber, totalBalance, avaialableBalance);
        this.cardNumber = cardNumber;
    }
}
