package servicenumber;

public class ServiceNumber {

    private static int number = 0;
    private CodeOfService usluga;
    private final int id;

    public ServiceNumber(CodeOfService usluga) {
        setUsluga(usluga);
        number++;
        id = number;
    }

    public static int getNumber() {
        return number;
    }

    public CodeOfService getUsluga() {
        return usluga;
    }

    public void setUsluga(CodeOfService usluga) {
        this.usluga = usluga;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        String result;
        result = String.format("%s  -  %d", getUsluga().getOpisanie(), getId());
        return result;
    }
}
