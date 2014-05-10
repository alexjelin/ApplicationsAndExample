package serializationwithintegerarrayinfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationWithIntegerArrayInFile {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int[] numbers = {1, 2, 3, 4, 5};

        File newF = new File("txt.txt");
        FileOutputStream newF2 = new FileOutputStream(newF);
        ObjectOutputStream obj2 = new ObjectOutputStream(newF2);
        obj2.writeObject(numbers);
        obj2.close();

        FileInputStream newF1 = new FileInputStream(newF);
        ObjectInputStream obj1 = new ObjectInputStream(newF1);
        int[] newAr = (int[]) obj1.readObject();
        obj1.close();

        newF.deleteOnExit();
        for (int i = 0; i < newAr.length; i++) {
            System.out.printf("%d\n", newAr[i]);
        }
    }
}
