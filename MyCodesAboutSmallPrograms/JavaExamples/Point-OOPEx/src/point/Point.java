/*
 * konzolno prilojenie za domashnoto ot sedmica 21.05-26.05
 */
package point;

public class Point {

    private int[] cordinates = new int[2];
// acesor i ogranichitel za masivyt ot celochislen tip;
    public int[] getCordinates() {
        int[] copy = new int[cordinates.length];
        for (int i = 0; i < cordinates.length; i++) {
            copy[i] = cordinates[i];
        }
        return copy;
    }

    public void setCordinates(int[] newCordinates) {
        if (newCordinates != null) {
            cordinates = new int[newCordinates.length];
            for (int k = 0; k < cordinates.length; k++) {
                cordinates[k] = newCordinates[k];
            }
        } else {
            throw new IllegalArgumentException("Nevalidna stoinost");
        }
    }
// konskturi za obshto polzvane , kopirane i podrazbirane;
    public Point(int[] newCord) {
        setCordinates(newCord);
    }

    public Point() {
        this(new int[]{0, 0});
    }

    public Point(Point p) {
        this(p.cordinates);
    }
    
// metod za izpisvane na kordinatite 
    public String toString() {
        String result = "";
        for (int i = 0; i < cordinates.length; i++) {
            result += String.format("%d ", cordinates[i]);
        }
        return result;
    }
}
