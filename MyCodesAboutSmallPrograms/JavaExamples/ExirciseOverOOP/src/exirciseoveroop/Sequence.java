package exirciseoveroop;

import java.util.Random;

public class Sequence {

    private Object[] obs;
    private int next = 0;

    public Sequence(int size) {
        obs = new Object[size];
    }

    public void add(Object x) {
        if (next < obs.length) {
            obs[next] = x;
            next++;
        }
    }

    private class RSelector implements Selector {

        int i = 0;

        public boolean end() {
            return i == obs.length;
        }

        public Object current(int i) {
            return obs[i];
        }

        public void next(int i) {
            if (i >= 0) {
                i--;
            }
        }
    }

    private class Sselector implements Selector {// inner class манипулира преместване от първия към последния

        int i = 0;

        public boolean end() {
            return i == obs.length;
        }

        public Object current(int i) {
            return obs[i];
        }

        public void next(int i) {
            if (i < obs.length) {
                i++;
            }
        }
    } // end of inner class

    public Selector getSelector() {
        return new Sselector();
    }

    public Selector getRSelector() {
        return new RSelector();
    }

    public static void main(String[] args) {
        int sizeOfObj = 8;
        Sequence newSeq = new Sequence(sizeOfObj);
        Random rand = new Random();
        Selector exS = newSeq.getSelector();
        Selector exR = newSeq.getRSelector();
        for (int i = 1; i <= sizeOfObj; i++) {
            int number = (int) rand.nextInt() * 100;
            newSeq.add(number);
        }

        for (int i = 1; i < sizeOfObj; i++) {
            System.out.printf("%o", exS.current(i).toString());
        }

        for (int i = 1; i < sizeOfObj; i++) {
            System.out.printf("%o", exR.current(i).toString());
        }
    }
}
