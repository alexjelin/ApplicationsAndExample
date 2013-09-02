package point;

public class Rectangle {

    Point[] pointsOfRectangle = new Point[2];

    public Rectangle(Point[] newArray) {
        setPointsOfRectangle(newArray);
    }

    public Rectangle(Rectangle r) {
        this(r.pointsOfRectangle);
    }

    public Point[] getPointsOfRectangle() {
        Point[] copyArray = new Point[pointsOfRectangle.length];

        for (int j = 0; j < pointsOfRectangle.length; j++) {
            copyArray[j] = new Point(pointsOfRectangle[j]);
        }

        return copyArray;
    }

    public void setPointsOfRectangle(Point[] newArrayOfRectangle) {
        if (newArrayOfRectangle != null) {
            pointsOfRectangle = new Point[newArrayOfRectangle.length];
            for (int i = 0; i < pointsOfRectangle.length; i++) {
                pointsOfRectangle[i] = new Point(newArrayOfRectangle[i]);
            }
        } else {
            throw new IllegalArgumentException("Imate nevalidna stoinost!");
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < pointsOfRectangle.length; i++) {
            result += String.format("%d", pointsOfRectangle[i].getCordinates().toString());
        }
        return result;
    }
}
