package homework14;

public class Line extends Point {

    Point sPoint;
    Point ePoint;

    public Point getsPoint() {
        return sPoint;
    }

    public Point getePoint() {
        return ePoint;
    }

    public void setsPoint(Point newsPoint) {
        if (newsPoint != null) {
            this.ePoint = newsPoint;
        } else {
            throw new IllegalArgumentException("Nevalidni danni!");
        }
    }

    public void setePoint(Point newePoint) {
        if (newePoint != null) {
            this.ePoint = newePoint;
        } else {
            throw new IllegalArgumentException("Nevalidni danni!");
        }
    }

    public Line(double weight,int x,int y, Point s, Point e) {
        super(weight,x,y);
        setsPoint(s);
        setePoint(e);

    }

    public Line(Line l) {
        this(l.getWeight(),l.getX(),l.getY(), l.ePoint, l.sPoint);
    }

    public Line() {
        this(0,0,0, new Point(0, 0), new Point(0, 0));
    }

    public double calcWeight() {
        double daljinaNaliniqta = Math.sqrt((Math.pow(sPoint.getX(), 2) - Math.pow(ePoint.getX(), 2)) + (Math.pow(sPoint.getY(), 2) - Math.pow(ePoint.getY(), 2)));
        double weight = daljinaNaliniqta * ((sPoint.getWeight() + ePoint.getWeight()) / 2);
        return weight;
    }

    public String toString() {
        String result = String.format("Weight:!\nTochkite na liniqa sa  X:%d% , Y:%d ,  X:%d , Y:%d",getsPoint().getX(),getsPoint().getY(), getePoint().getX(),getePoint().getY());
        return result;
    }
}
