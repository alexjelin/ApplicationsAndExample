package homework14;

public class Point extends HeavyElement {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        if (newX >= 0) {
            this.x = newX;
        } else {
            this.x = 0;
        }
    }

    public void setY(int newY) {
        if (newY >= 0) {
            this.y = newY;
        } else {
            this.y = 0;
        }
    }

    public Point(double weight, int x, int y) {
        super(weight);
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0, 0);
    }

    public Point(Point p) {
        this(p.getWeight(), p.x, p.y);
    }

    public String toString() {
        String result = String.format("Weight%.2f ! \n Kordinatite x i y sa :%d i %d!", getWeight(), getX(), getY());
        return result;

    }

    public double calcWeight() {
        double weightByPoint = getWeight();
        return weightByPoint;
    }
}
