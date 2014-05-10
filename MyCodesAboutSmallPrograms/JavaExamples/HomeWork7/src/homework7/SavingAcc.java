package homework7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SavingAcc extends BankAccount {
    
    private static double dblIntRate;
    
    public double getDblIntRate() {
        return dblIntRate;
    }
    
    public void setDblIntRate(double dblIntRate) {
        this.dblIntRate = dblIntRate;
    }
    
    public SavingAcc() {
    }
    
    public SavingAcc(int nomer, int balance, double newDblIntRate) {
        super(nomer, balance);
        this.dblIntRate = newDblIntRate;
    }
    
    @Override
    public String toString() {
        String result = String.format("%d %.2f %.2f \n", getIntAccNo(), getBalance(), getDblIntRate());
        return result;
    }
    
    @Override
    public void transfer(Transferable b, double amt) {
        double newBalance = getBalance() + getBalance() * getDblIntRate();
        setDblBalance(newBalance);
        try {
            withdraw(amt);
        } catch (UnsufficientFundsExceptions ex) {
            Logger.getLogger(SavingAcc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        deposit(amt);
        if (b instanceof CreditCardAcc) {
            CreditCardAcc test = (CreditCardAcc) b;
            int number = test.getIntTransCount();
            test.setIntTransCount(number + 1);
        }
        
    }
}
