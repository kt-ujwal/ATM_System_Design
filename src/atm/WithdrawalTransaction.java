package atm;

public class WithdrawalTransaction extends Transaction {
    private TransactionType transactionType;
    public WithdrawalTransaction(String tranctionId, Account account, int amount){
        super(tranctionId, account, amount);
        this.transactionType = TransactionType.WITHDRAW;
    }
    @Override
    public void execute() {
        account.debit(amount);
    }
}
