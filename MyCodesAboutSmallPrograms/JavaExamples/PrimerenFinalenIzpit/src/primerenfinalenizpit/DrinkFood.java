package primerenfinalenizpit;

public class DrinkFood extends Product {

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public DrinkFood(int id, double price, String desc, double weight) throws IllegalAccessException {
        super(id, price, desc);
        setVolume(volume);
    }

    @Override
    public String toString() {
        String result = "";
        result = String.format(">> ID:%d \n Price: %.2f \n Description : %s \n Volume : %.2f << \n", getId(), getPrice(), getDescription(), getVolume());
        return result;
    }
}
