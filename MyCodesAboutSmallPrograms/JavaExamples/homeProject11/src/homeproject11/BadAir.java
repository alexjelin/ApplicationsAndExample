package homeproject11;

public class BadAir {

    private String badSmell;
    private int concentration;

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BadAir other = (BadAir) obj;
        if (this.concentration != other.concentration) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%s , %d \n", this.badSmell, this.concentration));
        return builder.toString();
    }
}
