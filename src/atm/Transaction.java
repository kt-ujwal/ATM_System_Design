package atm;

public abstract class Transaction {
    protected final String transactionId;
    protected final Account account;
    protected int amount;

    public Transaction(String transactionId, Account account, int amount) {
        this.transactionId = transactionId;
        this.account = account;
        this.amount = amount;
    }
    public Transaction(String transactionId,Account account) {
        this.transactionId = transactionId;
        this.account = account;
    }
    public abstract void execute();
}
