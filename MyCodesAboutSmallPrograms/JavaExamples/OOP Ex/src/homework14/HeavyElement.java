package homework14;

public abstract class HeavyElement {

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWeight) {
        if (newWeight >= 0) {
            this.weight = newWeight;
        } else {
            throw new IllegalArgumentException("imate greshka v danite !");
        }
    }

    public HeavyElement(double weight) {
        setWeight(weight);
    }

    public HeavyElement() {
        this(0.00);
    }

    public HeavyElement(HeavyElement h) {
        this(h.getWeight());
    }

// deklaraciq na abstrakten medot za ichislqvane na tegloto;
    public abstract double calcWeight();

    public String toString() {
        String result = String.format("teglo %.2f!", getWeight());
        return result;
    }
}
