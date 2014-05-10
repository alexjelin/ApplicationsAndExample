package homework7;

public class UnsufficientFundsExceptions extends Exception {

    public UnsufficientFundsExceptions() {
        super("Sumata koqto iskate da izteglite ne e nalichna v smetkata!");
    }

    public UnsufficientFundsExceptions(String message) {
        super(message);
    }

    public UnsufficientFundsExceptions(String message, Exception ex) {
        super(message, ex);
    }
}
