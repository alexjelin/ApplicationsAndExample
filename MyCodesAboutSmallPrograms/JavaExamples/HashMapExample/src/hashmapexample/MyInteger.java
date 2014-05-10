package hashmapexample;

public class MyInteger {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return getNumber();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyInteger other = (MyInteger) obj;
        if (this.number != other.number) {
            return false;
        }
        return true;
    }

    public MyInteger(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyInteger{" + "number=" + this.number + '}';
    }
}
