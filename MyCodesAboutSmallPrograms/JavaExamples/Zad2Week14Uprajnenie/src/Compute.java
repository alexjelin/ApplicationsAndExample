
public abstract class Compute {

    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x >= 0) {
            this.x = x;
        } else {
            this.x = 0;
        }
    }

    public Compute(double newX) {
        setX(x);
    }

    public Compute() {
        this(0);
    }

    public Compute(Compute c) {
        this(c.x);
    }
    
    abstract double compute(double epsilon,double number);
}
