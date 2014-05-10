package exam;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class ListOfProducts<E extends Product> implements Serializable {

    private ArrayList<E> products;

    public ListOfProducts() {
        products = new ArrayList<E>();
    }

    public void addProduct(E product) {
        products.add(product);
    }

    public String[] toArray() {
        String[] descriptionOfProducts = new String[products.size()];

        for (int i = 0; i < products.size(); i++) {
            descriptionOfProducts[i] = products.get(i).toString();
        }
        return descriptionOfProducts;
    }

    public void toFile(String filename) throws FileNotFoundException, IOException {
        File file = new File(filename);
        FileOutputStream fileOutput = new FileOutputStream(file);
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

        for (int i = 0; i < products.size(); i++) {
            objectOutput.writeObject(products.get(i));
        }

        objectOutput.close();
    }

    public double averagePrice() {
        double averagePrices = 0.00;
        double sumOfprices = 0.00;

        for (int i = 0; i < products.size(); i++) {
            sumOfprices += products.get(i).getPrice();
        }
        averagePrices = sumOfprices / products.size();
        return averagePrices;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < products.size(); i++) {
            if (i == products.size() - 1) {
                result += String.format("%s", products.get(i).toString());
                break;
            }
            result += String.format("%s,", products.get(i).toString());
        }
        result += " ]";
        return result;
    }

    public void sortByPrice(Comparator<E> comparator) {
        Collections.sort(this.products, comparator);
    }

    // pisha tozi metod za da moje lesno da se proveri che pravilno se zaipsva v file;
    // testvan e v main method v test class;
    public void readFromFile(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File(name);
        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream fileObj = new ObjectInputStream(fileInput);
        int counter = 0;
        while (counter < products.size()) {
            counter++;
            Product txt = (Product) fileObj.readObject();
            String result = txt.toString();
            System.out.println(result);
        }
        fileObj.close();
    }

    public int size() {
        return products.size();
    }
}
