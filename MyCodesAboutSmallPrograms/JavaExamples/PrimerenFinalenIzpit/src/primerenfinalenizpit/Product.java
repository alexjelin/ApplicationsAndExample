package primerenfinalenizpit;

public class Product implements Comparable<Product> {

    private int id;
    private double price;
    private String description;

    public int getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(int id) throws IllegalAccessException {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalAccessException("Id to trqbva da e nad 0!");
        }
    }

    public void setPrice(double price) throws IllegalAccessException {
        if (price > 0.00) {
            this.price = price;
        } else {
            throw new IllegalAccessException("Cenata nemoje da e otricatelna!");
        }
    }

    public void setDescription(String description) throws IllegalAccessException {
        if (description != null) {
            this.description = description;
        } else {
            throw new IllegalAccessException("Molq vavedete opisanie na produkta!Prazno e!");
        }
    }

    @Override
    public String toString() {
        String result = "";
        result = String.format(">> ID:%d \n Price: %.2f \n Description : %s  << \n", getId(), getPrice(), getDescription());
        return result;
    }

    public Product(int id, double price, String description) throws IllegalAccessException {
        setId(id);
        setPrice(price);
        setDescription(description);
    }

    public Product() throws IllegalAccessException {
        throw new IllegalAccessException("kak she praish obekt bez danni ue :D");
    }

    public Product(Product pr) throws IllegalAccessException {
        this(pr.getId(), pr.getPrice(), pr.getDescription());
    }

    @Override
    public int compareTo(Product o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
