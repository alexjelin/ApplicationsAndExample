package zad1wekk14;

public class Triangle implements Measurable {

    private double alfaUngle;
    private double aSide;
    private double bSide;

    public Triangle(double newalfaUngle, double newASide, double newBSide) {
        setAlfaUngle(newalfaUngle);
        setaSide(newASide);
        setbSide(newBSide);
    }

    public double getAlfaUngle() {
        return alfaUngle;
    }

    public double getaSide() {
        return aSide;
    }

    public double getbSide() {
        return bSide;
    }

    public void setAlfaUngle(double mewAlpha) {
        if (mewAlpha >= 0) {
            this.alfaUngle = alfaUngle;
        } else {
            this.alfaUngle = 0;
        }
    }

    public void setaSide(double newAside) {
        if (newAside >= 0) {
            this.aSide = newAside;
        } else {
            this.bSide = 0;
        }
    }

    public void setbSide(double newBside) {
        if (newBside >= 0) {
            this.bSide = newBside;
        } else {
            this.bSide = 0;
        }
    }

    public String toString() {
        String result = String.format("Agal : %.2f\nAB=%.2f \nBC=%.2f", getAlfaUngle(), getaSide(), getbSide());
        return result;
    }

    public double area() {
        double areaOfTriangle = (aSide * bSide * Math.sin(alfaUngle)) / 2;
        return areaOfTriangle;
    }

    public double getBC() {
        double bC = Math.pow(aSide, 2) + Math.pow(bSide, 2) - 2 * aSide * bSide * Math.cos(Math.toDegrees(alfaUngle));
        return bC;
    }

    public double getABC() {
        double result;
        result = ((2 * area()) / (aSide * getBC()));
        double aBC = Math.toDegrees(result);
        return aBC;
    }

    public double getBAC() {
        double result;
        result = ((2 * area()) / (bSide * getBC()));
        double bAC = Math.toDegrees(result);
        return bAC;
    }

    public double getMinHeight() {
        double max = 0;
        if (aSide > bSide) {
            max = aSide;
        }

        if (aSide < bSide) {
            max = bSide;
        }

        if (max < getBC()) {
            max = getABC();
        }

        double h = (area() * 2) / max;

        return h;
    }

    public double perimeter() {
        return aSide + bSide + getBC();
    }
}
