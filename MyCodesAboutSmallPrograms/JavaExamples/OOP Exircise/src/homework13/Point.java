package homework13;

public class Point {

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
            throw new IllegalArgumentException("Vashta kordinata e navalidna");
            // moje i da se inicializira po tozi nachin;
            // this.x=0;
        }
    }

    public void setY(int newY) {
        if (newY >= 0) {
            this.y = newY;
        } else {
            throw new IllegalArgumentException("Vashta kordinata e navalidna");
            // moje i da se inicializira po tozi nachin;
            // this.y=0;
        }
    }

    public Point(int newX, int newY) {
        setX(newX);
        setY(newY);
    }

    public Point() {
        this(0, 0);
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public String toString() {
        String result = "";
        result = String.format("x=%d;y=%d !", getX(), getY());
        return result;
    }
}
