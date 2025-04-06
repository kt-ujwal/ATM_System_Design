package atm;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;

public class ATM {
private final BankingService bankingService;
private final CashDispenser cashDispenser;
private static final AtomicLong transactionCounner = new AtomicLong(0);

public ATM(BankingService bankingService, CashDispenser cashDispenser) {
    this.bankingService = bankingService;
    this.cashDispenser = cashDispenser;
}
public void authenticateUser(Card card) {
    // stub code
}
public void checkBalance(String accountNumber) {
    Account account = bankingService.getAccount(accountNumber);
    Transaction transaction = new BalanceInquiryTransaction(generateTransactionId(), account);
    bankingService.processTransaction(transaction);
}

public void withdrawCash(String accountNumber, int amount) {
    Account account = bankingService.getAccount(accountNumber);
    if(account !=null && account.getAvailableBalance()<amount) {
        System.out.println("Error Insufficient Balance");
        return;
    }
    Transaction transaction = new WithdrawalTransaction(generateTransactionId(), account, amount);
    bankingService.processTransaction(transaction);
}

public void depositCash(String accountNumber, int amount) {
    Account account = bankingService.getAccount(accountNumber);
    Transaction transaction = new DepositTransaction(generateTransactionId(), account, amount);
    bankingService.processTransaction(transaction);
}

private String generateTransactionId(){
    long transactionNumber = transactionCounner.incrementAndGet();
    String timestamp = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
    return "TXN"+timestamp+"_"+String.format("%10d", transactionNumber);
}
}
