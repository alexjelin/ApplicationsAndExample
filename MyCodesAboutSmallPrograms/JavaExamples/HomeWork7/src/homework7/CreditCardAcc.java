package homework7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CreditCardAcc extends BankAccount {
    
    private static int intTransCount;
    
    public int getIntTransCount() {
        return intTransCount;
    }
    
    public void setIntTransCount(int intTransCount) {
        this.intTransCount = intTransCount;
    }
    
    public CreditCardAcc(int intAccNo, double dblBalance, int newInttransCount) {
        super(intAccNo, dblBalance);
        this.intTransCount = newInttransCount;
    }
    
    @Override
    public void transfer(Transferable b, double amt) {
        if (b instanceof SavingAcc) {
            SavingAcc test1 = (SavingAcc) b;
            double newBalance = test1.getBalance() + test1.getBalance() * test1.getDblIntRate();
            test1.setDblBalance(newBalance);
        }
        
        int number = getIntTransCount() + 1;
        setIntTransCount(number);
        try {
            withdraw(amt);
        } catch (UnsufficientFundsExceptions ex) {
            Logger.getLogger(CreditCardAcc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        deposit(amt);
    }
}
