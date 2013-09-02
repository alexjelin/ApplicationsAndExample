package homework13;

public class Rectangle {

    Point leftUpUngleCord;
    Point rightDownUngleCord;

    public Rectangle(Point newLeftUp, Point newRightDownCord) {
        setLeftUpUngleCord(newLeftUp);
        setRightDownUngleCord(newRightDownCord);
    }

    public Rectangle() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public Rectangle(Rectangle r) {
        this(r.getLeftUpUngleCord(), r.getRightDownUngleCord());
    }

    public Point getLeftUpUngleCord() {
        return leftUpUngleCord;
    }

    public Point getRightDownUngleCord() {
        return rightDownUngleCord;
    }

    public void setLeftUpUngleCord(Point newleftUpUngleCord) {
        if (newleftUpUngleCord != null) {
            this.leftUpUngleCord = newleftUpUngleCord;
        } else {
            throw new IllegalArgumentException("Imate nekorektni stoinosti!");
        }
    }

    public void setRightDownUngleCord(Point newRightDownUngleCord) {
        if (newRightDownUngleCord != null) {
            this.rightDownUngleCord = newRightDownUngleCord;
        } else {
            throw new IllegalArgumentException("Imate nekorektni stoinosti!");
        }
    }

    public double diagonaleOfRectangle() {
        double diagonal;
        diagonal = Math.sqrt(Math.pow(getLeftUpUngleCord().getX(), 2) - Math.pow(getRightDownUngleCord().getX(), 2)
                + (Math.pow(getLeftUpUngleCord().getY(), 2) - Math.pow(getRightDownUngleCord().getY(), 2)));
        return diagonal;
    }

    public String toString() {
        String result = String.format("\nKordinatite na gorniq lqv agal sa %s \n"
                + "Kordinatite na dolniq desen agal sa %s \n "
                + "Diagonalat na pravoayhlnka e raven na %.2f!", getLeftUpUngleCord().toString()
                , getRightDownUngleCord().toString(),diagonaleOfRectangle());
        return result;
    }
}
