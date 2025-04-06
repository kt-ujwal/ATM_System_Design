package atm;

import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class BankingService {
    private final Map<String, Account> accounts = new ConcurrentHashMap<>();

    public Account createAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, new Account(accountNumber,initialBalance,initialBalance));
        return accounts.get(accountNumber);
    }



    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void processTransaction(Transaction transaction) {
        transaction.execute();
    }





    private String generateAccountNumber() {
        return UUID.randomUUID().toString();
    }
}
