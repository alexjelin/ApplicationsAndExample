package primerenfinalenizpit;

public class FoodProduct extends Product {

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>=0.00)
        this.weight = weight;
        else{
            return;
        }
    }
    

    public FoodProduct(int id, double price, String desc, double weight) throws IllegalAccessException {
        super(id,price,desc);
        setWeight(weight);
    }
    
     @Override
    public String toString() {
        String result = "";
        result = String.format(">> ID:%d \n Price: %.2f \n Description : %s \n Weight : %.2f << \n", getId(), getPrice(), getDescription(),getWeight());
        return result;
    }
}
