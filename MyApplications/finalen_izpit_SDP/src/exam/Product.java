package exam;

import java.io.Serializable;

public class Product implements Serializable {

    private final int INV_NUMBER;
    private static int counter = 0;
    private String invDescription;
    private double price;

    public String getInvDescription() {
        return invDescription;
    }

    public void setInvDescription(String invDescription) throws IllegalAccessException {
        if (invDescription != null) {
            this.invDescription = invDescription;
        } else {
            throw new IllegalAccessException("Zaglavieto na produkta nemoje da e prazno!");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalAccessException {
        if (price >= 0.00) {
            this.price = price;
        } else {
            throw new IllegalAccessException("Cenata nemoje da e otricatelno chislo!");
        }
    }

    public Product(String invDescription, double price) throws IllegalAccessException {
        counter++;
        this.INV_NUMBER = counter;
        setInvDescription(invDescription);
        setPrice(price);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(" ID:%d Descrtiption:%s Price:%.2f  ", this.INV_NUMBER, this.getInvDescription(), this.getPrice()));
        return builder.toString();
    }
}
