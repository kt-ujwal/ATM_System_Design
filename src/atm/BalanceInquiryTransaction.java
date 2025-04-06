package atm;

public class BalanceInquiryTransaction extends Transaction {
    private TransactionType type;

    BalanceInquiryTransaction(String transactionId, Account account){
        super(transactionId, account);
        this.type = TransactionType.BALANCE_INQUIRY;
    }
    @Override
    public void execute() {
        System.out.println(account.getAvailableBalance());
    }
}
