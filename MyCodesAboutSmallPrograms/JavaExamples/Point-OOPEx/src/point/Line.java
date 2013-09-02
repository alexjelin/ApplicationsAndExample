package point;

import java.awt.Color;
import java.awt.Graphics;


public class Line {

    Point[] lineArray = new Point[2];

    public Line(Point[] newLineArray) {
        setLineArray(newLineArray);
    }
    
    public Line(){
        this(new Point[]{});
    }

    public void setLineArray(Point[] newlineArray) {
        if (newlineArray != null) {
            lineArray = new Point[newlineArray.length];
            for (int k = 0; k < lineArray.length; k++) {
                lineArray[k] = new Point(newlineArray[k]);
            }
        } else {
            throw new IllegalArgumentException("Nevalidna stoinost");
        }
    }

    public Point[] getLineArray() {
        Point[] copyLinePointsArray = new Point[lineArray.length];

        for (int counter = 0; counter < lineArray.length; counter++) {
            copyLinePointsArray[counter] = new Point(lineArray[counter]);
        }
        return copyLinePointsArray;
    }

    public Line(Line l) {
        this(l.lineArray);      
    }
    
     public String toString() {
        String result = "";
        for (int i = 0; i < lineArray.length; i++) {
            result += String.format("%d", lineArray[i].getCordinates().toString());
        }
        return result;
    }
     
     public void draw(Graphics g){
         g.setColor(Color.BLACK);
         g.drawLine(new Point().getCordinates()[0],new Point().getCordinates()[1],
                 new Point().getCordinates()[3],new Point().getCordinates()[4]);
     }
     
}
