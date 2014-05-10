package hashmapexample;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class test {

    public static void main(String[] args) {
        HashMap<MyInteger, MyInteger> intCount = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            intCount.put(new MyInteger(i), new MyInteger(rand.nextInt(9)));
            i++;
        }

        Collection<MyInteger> list = intCount.values();
        int number = Collections.frequency(list, new MyInteger(1));
        System.out.println(number);
    }
}
