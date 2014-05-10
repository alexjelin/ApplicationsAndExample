package uprajnenie;

public class EmptyLinkedListExeption extends RuntimeException {

    public EmptyLinkedListExeption() {
        super("list");
    }

    public EmptyLinkedListExeption(String message) {
        super(message);
    }
}
