package test;

import javax.xml.soap.Text;

public class Test {

    private int[] testArray;

    public int[] getTestArray() {
        int[] copy = new int[testArray.length];

        for (int i = 0; i < testArray.length; i++) {
            copy[i] = testArray[i];
        }
        return copy;
    }

    public void setTestArray(int[] newtestArray) {
        if (newtestArray != null) {
            testArray = new int[newtestArray.length];

            for (int i = 0; i < testArray.length; i++) {
                testArray[i] = newtestArray[i];
            }
        } else {
            throw new IllegalArgumentException("Nekorektna stoinost");
        }
    }

    public Test(int[] newtestArray) {
        setTestArray(newtestArray);
    }

    public Test(Test c) {
        this(c.getTestArray()); // ili this(c.testArray);
    }

    public String toString() {
        String result = " ";
        for (int k = 0; k < testArray.length; k++) {
            result += String.format("%d", testArray[k]);
        }
        return result;
    }

    public int[] bubleSort() {
        for (int pass = 1; pass < testArray.length; pass++) {
            for (int element = 0; element < testArray.length - 1; element++) {
                if (testArray[element] > testArray[element + 1]) {
                    swap(testArray, element, element + 1);
                }
            }
        }
        return testArray;

    }

    public void swap(int[] array, int number1, int number2) {
        int hold;
        hold = array[number1];
        array[number1] = array[number2];
        array[number2] = hold;
    }

    public String linearSearch(int SearchKey) {
        String index = " ";
        for (int i = 0; i < testArray.length; i++) {
            if (SearchKey == testArray[i]) {
                index += String.format("%d \n", i);
                break;
            } else {
                index += "Not found";
            }
        }
        return index;
    }

    public void selectionSort() {
        for (int i = 0; i < testArray.length - 1; i++) {
            for (int j = i + 1; j < testArray.length; j++) {
                if (testArray[i] > testArray[j]) {
                    swap(testArray, testArray[i], testArray[j]);
                }
            }
        }
        
    }
}
