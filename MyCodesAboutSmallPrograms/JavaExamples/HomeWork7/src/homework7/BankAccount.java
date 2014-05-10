package homework7;

import javax.swing.JOptionPane;

public class BankAccount implements Transferable{

    private int intAccNo;

    public int getIntAccNo() {
        return intAccNo;
    }

    public void setIntAccNo(int intAccNo) {
        this.intAccNo = intAccNo;
    }

    public void setDblBalance(double dblBalance) {
        this.dblBalance = dblBalance;
    }
    private double dblBalance;

    public BankAccount(int intAccNo, double dblBalance) {
        this.intAccNo = intAccNo;
        this.dblBalance = dblBalance;
    }

    public BankAccount() {
        this(0, 0.0);
    }

    public BankAccount(BankAccount b) {
        this(b.intAccNo, b.dblBalance);
    }

    public double getBalance() {
        return this.dblBalance;
    }

    public void withdraw(double amt) throws UnsufficientFundsExceptions {
        try {
            if (amt <= dblBalance) {
                this.dblBalance -= amt;
            } else {
                throw new UnsufficientFundsExceptions();
            }
        } catch (UnsufficientFundsExceptions un) {
            JOptionPane.showMessageDialog(null, un.getMessage());
        }
    }

    public void deposit(double amt) {
        this.dblBalance += amt;
    }

    @Override
    public void transfer(Transferable b, double amt) {
        
    }
}
