package homework6;

public class Vector {

    private int[] p;
    private int first = 0;
    private int length = 1;

    public int getLength() {
        return length;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        if (first >= 0) {
            this.first = first;
        } else {
            this.first = 0;
        }
    }

    public int[] getP() {
        return p;
    }

    public void setP(int[] pA) {
        p = new int[pA.length];
        for (int i = 0; i < p.length; i++) {
            p[i] = pA[i];
        }
    }

    public Vector(int lenght, int first) {
        this.length = lenght;
        this.first = first;
    }

    public Vector() {
        this(1, 0);
    }

    public Vector(Vector v) {
        this(v.first, v.length);
    }

    public int getLastIndex() {
        return p.length - 1;
    }

    public void setAt(int myIndex, int myValue) throws VectorIndexOutOfBoundException {
        if (myIndex >= first && myIndex < p.length) {
            p[myIndex] = myValue;
        } else {
            throw new VectorIndexOutOfBoundException("Nevaliden indeks za masiva!");
        }
    }

    public int getIndex(int myIndex) throws VectorIndexOutOfBoundException {
        if (myIndex >= first && myIndex < p.length) {
            return p[myIndex];
        } else {
            throw new VectorIndexOutOfBoundException("Nevaliden indeks za masiva!");
        }
    }
}
