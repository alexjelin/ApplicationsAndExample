package final8;

public class Media implements Comparable<Media> {

   public final int id;
    private static int number = 0;
    private double price;
    private String title;

    public int getId() {
        return id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) throws IllegalAccessException {
        if (price >= 0.00) {
            this.price = price;
        } else {
            throw new IllegalAccessException("cenata trqbva da e po golqma ot 0!");
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) throws IllegalAccessException {
        if (title != null) {
            this.title = title;
        } else {
            throw new IllegalAccessException("Nemoje zaglavie da e prazen tekst!");
        }
    }

    public Media(double price, String title) throws IllegalAccessException {
        setPrice(price);
        setTitle(title);
        this.number++;
        this.id = number;
    }

    @Override
    public String toString() {
        String result = "";
        result = String.format("%d - %.2f - %s \n", getId(), getPrice(), getTitle());
        return result;
    }

    @Override
    public int compareTo(Media media) {
        if (this.price > media.price) {
            return 1;
        } else if (this.price < media.price) {
            return -1;
        } else {
            return 0;
        }
    }
}
