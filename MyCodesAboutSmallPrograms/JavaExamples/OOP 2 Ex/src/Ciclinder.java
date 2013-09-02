
public class Ciclinder extends Circle {

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

    public Ciclinder(double newR, double newH) {
        super(newR);
        setH(newH);
    }

    public Ciclinder() {
        this(0.00, 0.00);
    }

    public Ciclinder(Ciclinder c) {
        this(c.r, c.h);
    }

    public String toString() {
        String result = String.format("Visochinata e %.2f !\nRadiusyt e %.2f!", getH(), super.toString());
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
