package bankamount;

public class Loan {

    private double loanAmount;
    private int numberOfYears;
    private double annualInterestRate;

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setLoanAmount(double newLoanAmount) {
        if (newLoanAmount >= 0) {
            this.loanAmount = loanAmount;
        } else {
            this.loanAmount = 0.00;
        }
    }

    public void setNumberOfYears(int newNumberOfYears) {
        if (newNumberOfYears >= 0) {
            this.numberOfYears = numberOfYears;
        } else {
            this.numberOfYears = 1;
        }
    }

    public void setAnnualInterestRate(double newannualInterestRate) {
        if (newannualInterestRate >= 0) {
            this.annualInterestRate = annualInterestRate;
        } else {
            this.annualInterestRate = 0.0;
        }
    }

    public Loan(double loanAmount, int numberOfYears, double annualInterestRate) {
        setLoanAmount(loanAmount);
        setNumberOfYears(numberOfYears);
        setAnnualInterestRate(annualInterestRate);
    }

    public Loan(Loan l) {
        this(l.getLoanAmount(), l.getNumberOfYears(), l.getAnnualInterestRate());
    }

    public Loan() {
        this(1, 1, 1);
    }

    public double sumOfLoan() {
        double sum;
        double monthOfLoan = annualInterestRate / 12;
        sum = ((loanAmount * monthOfLoan) / (1 - Math.pow((1 / (1 + monthOfLoan)), numberOfYears * 12)));
        return sum;
    }
}
