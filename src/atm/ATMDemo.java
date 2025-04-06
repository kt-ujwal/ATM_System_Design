package atm;

import java.util.Date;

public class ATMDemo {
    public static void run(){
        BankingService bankingService = new BankingService();
        CashDispenser cashDispenser = new CashDispenser(100000);
        ATM atm = new ATM(bankingService, cashDispenser);

        bankingService.createAccount("1234567890", 1000.0);
        bankingService.createAccount("9876543210", 500.0);

        Card card = new Card("1234567890", "1234",  new Date(2035,12,23),"raj");
        atm.authenticateUser(card);

        atm.checkBalance("1234567890");

        atm.withdrawCash("1234567890", 500);
        atm.depositCash("9876543210", 200);

        atm.checkBalance("1234567890");

    }
}
