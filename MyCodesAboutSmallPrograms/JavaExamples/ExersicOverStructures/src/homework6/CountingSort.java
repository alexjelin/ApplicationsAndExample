package homework6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CountingSort {

    public CountingSort(int[] intArr) {
        this.intArr = intArr;
    }
    private int[] intArr;

    public int[] getIntArr() {
        return intArr;
    }

    public void setIntArr(int[] intArr) {
        this.intArr = intArr;
    }

    public int getMaxValue() {
        int max = intArr[0];
        for (int j = 1; j < intArr.length; j++) {
            if (max < intArr[j]) {
                max = intArr[j];
            }
        }

        return max;
    }

    public class FileWriter implements IFileOperational {

        @Override
        public void toFile(String filename) {
            int[] sortedArr = countingSort();
            String result = "\n Sortiran masiv: \n";
            for (int i = 0; i < sortedArr.length; i++) {
                result += String.format("%d \n", sortedArr[i]);
            }

            File fWriter = new File("text.txt");
            try {
                Formatter writiing = new Formatter(fWriter);
                writiing.format(result);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CountingSort.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public IFileOperational getFileWriter() {
        return new FileWriter();
    }

    public int[] countingSort() {
        int k = getMaxValue();
        int[] sortedArray = new int[intArr.length];
        int lenght = intArr.length - sortedArray.length + 1;
        Vector counts1 = new Vector(lenght, 7);
        int[] counts = counts1.getP();
        counts[i] = 0;
    }
    for (int j = 0;
    j< intArr.length ;
    j

    
        ++) {
            counts[intArr[j]]++;
    }
    for (int i = 1;
    i <= k ;
    i

    
        ++) {
            counts[i] = counts[i] + counts[i - 1];

    }
    for (int j = intArr.length - 1;
    j >= 0; j

    
        --) {
            sortedArray[counts[intArr[j]] - 1] = intArr[j];
        counts[intArr[j]] = counts[intArr[j]] - 1;
    }
    return sortedArray ;
}
}
