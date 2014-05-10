package primerenfinalenizpit;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Test<E extends Product> {

    public static void main(String[] args) throws IllegalAccessException {
        DrinkFood drink1 = new DrinkFood(1, 2, "energy", 0.75);
        DrinkFood drink2 = new DrinkFood(2, 3, "juice", 0.5);

        DrinkFood[] drinkArray = new DrinkFood[2];
        drinkArray[0] = drink1;
        drinkArray[1] = drink2;

        FoodProduct food1 = new FoodProduct(10, 2.5, "chips", 0.250);
        FoodProduct food2 = new FoodProduct(10, 2.5, "chips", 0.250);

        FoodProduct[] array = new FoodProduct[2];
        array[0] = food1;
        array[1] = food2;

        Invoice<Product> list = new Invoice<>();
        list.addArrayPr(drinkArray);
        list.addArrayPr(array);
        list.sortList();
        list.printElements();
        list.extractTwoLargeNumbers();
    }
}
