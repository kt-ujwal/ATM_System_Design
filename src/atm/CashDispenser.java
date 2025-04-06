package atm;

public class CashDispenser {
    private int cashAvailable;


    public CashDispenser(int cashAvailable) {
        this.cashAvailable = cashAvailable;
    }



    public synchronized void dispenseCash(int amount) {
        int cash =0;
        if(canDispenseCash()){
           cashAvailable -= amount;
        }
        else{
            throw new IllegalArgumentException("Insufficient cash available in the ATM");
        }

    }

    public boolean canDispenseCash() {
        return cashAvailable >0;
    }

    private int getCashAvailable() {
        return cashAvailable;
    }
    private void setCashAvailable(int cashAvailable) {
        this.cashAvailable = cashAvailable;
    }
}
