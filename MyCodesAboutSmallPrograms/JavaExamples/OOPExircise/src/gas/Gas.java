package gas;

public class Gas {

    private String opisanie;
    private int procent;

    public void setOpisanie(String newOpisanie) {
        if (newOpisanie != null) {
            this.opisanie = newOpisanie;
        } else {
            throw new IllegalArgumentException("Ne e vavedenea korektna stoinost!");
        }
    }

    public void setProcent(int newProcent) {
        if (newProcent >= 0 && newProcent <= 100) {
            this.procent = newProcent;
        } else {
            throw new IllegalArgumentException("Abe vavedeni procent ot edno to 100 we pich");
        }
    }

    public String getOpisanie() {
        return opisanie;
    }

    public int getProcent() {
        return procent;
    }

    public Gas(String opisanie, int procent) {
        setOpisanie(opisanie);
        setProcent(procent);
    }

    public Gas(Gas g) {
        this(g.opisanie, g.procent);
    }

    public String toString() {
        String result = String.format("Opisanie:%s\n" + "Koncentraciq:%d", opisanie, procent);
        return result;
    }
}
