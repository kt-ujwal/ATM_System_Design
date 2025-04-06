package atm;

import java.util.Date;

public class Card {
    private final String cardNumber;
    private String pin;
    private final Date cardExpiry;
    private String customerName;

    public Card(String cardNumber, String pin, Date cardExpiry, String customerName) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cardExpiry = cardExpiry;
        this.customerName = customerName;
    }

    public Card(String cardNumber, String pin, Date cardExpiry) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cardExpiry = cardExpiry;
        this.customerName = null;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;

    }

}
