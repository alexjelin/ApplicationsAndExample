package homework6;

public class VectorIndexOutOfBoundException extends Exception {

    public VectorIndexOutOfBoundException() {
        super("izvan indeksite na masiva ste!");
    }

    public VectorIndexOutOfBoundException(String message) {
        super(message);
    }

    public VectorIndexOutOfBoundException(String message, Exception ex) {
        super(message, ex);
    }
}
