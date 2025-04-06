package atm;

public class DepositTransaction extends Transaction {
    private TransactionType type;
    public DepositTransaction(String TransactionId, Account account, int amount){
        super(TransactionId, account, amount);
        this.type = TransactionType.DEPOSIT;
    }
    @Override
    public void execute() {
        account.credit(amount);
    }
}
