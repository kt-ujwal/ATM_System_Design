package atm;

public class Bank {
    private static Bank bank;
    private final String bankName;
    private final String bankCode;

    private Bank(String bankName, String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }
    public static Bank getBank() {
        if (bank == null) {
            synchronized (Bank.class) {
                if (bank == null) {
                    bank = new Bank("Bank Name", "Bank Code");
                }
            }
        }
        return bank;
    }
    public String getBankName() {
        return bankName;
    }
    public String getBankCode() {
        return bankCode;
    }
}
