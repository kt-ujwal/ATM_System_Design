package atm;

public class Customer {
    private Person customer;
    private CustomerStatus status;
    private Card card;
    private Account account;

    Customer(Person customer, Card card, Account account) {
        this.customer = customer;
        this.status = CustomerStatus.ACTIVE;
        this.card = card;
        this.account = account;
    }
    public boolean makeTransaction(Transaction transaction) {
        return true;
    }

    public Address getBillingAddress() {
        return this.customer.getAddress();
    }

    public void changePin(String pin) {
        card.setPin(pin);
    }
}
