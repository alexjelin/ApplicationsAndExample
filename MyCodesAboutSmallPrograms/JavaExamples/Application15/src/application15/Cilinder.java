package application15;

public class Cilinder extends Circle {

    private double h;

    public double getH() {
        return h;
    }

    public void setH(double newH) {
        if (newH >= 0) {
            this.h = newH;
        } else {
            this.h = 1.00;
        }
    }

    public Cilinder(double newR, double newH) {
        super(newR);
        setH(newH);
    }

    public Cilinder() {
        this(0.00, 0.00);
    }

    public Cilinder(Cilinder c) {
        this(c.r, c.h);
    }

    public String toString() {
        String result = String.format("Visochinata e %.2f! !\n %s!", getH(), super.toString());
        return result;
    }

    public double area() {
        double areaOfCiclinder;
        areaOfCiclinder = 2 * getR() * Math.PI * (getR() + getH());
        return areaOfCiclinder;
    }

    public double computemesure() {
        return area();
    }
}
