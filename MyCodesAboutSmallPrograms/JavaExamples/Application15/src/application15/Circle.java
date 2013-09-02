
package application15;

public class Circle implements Measurable {

    double r;

    public void setR(double newR) {
        if (newR > 0) {
            this.r = newR;
        } else {
            this.r = 1;
        }
    }

    public double getR() {
        return r;
    }

    public Circle(double newR) {
        setR(newR);
    }

    public Circle() {
        this(0.00);
    }

    public Circle(Circle c) {
        this(c.r);
    }

    public String toString() {
        String result = String.format("Radius e :%.2f!", getR());
        return result;
    }

    public double area() {
        double areaOfCircle;
        areaOfCircle = Math.PI * Math.pow(r, 2);
        return areaOfCircle;
    }

    public double computemesure() {
        double area = area();
        return area;
    }
}

