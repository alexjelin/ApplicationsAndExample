package coutingsortimplementation;

public class CountSor {

    private int[] arrayWithNumbers;

    public int[] getArrayWithNumbers() {
        int[] copy = new int[arrayWithNumbers.length];

        for (int i = 0; i < arrayWithNumbers.length; i++) {
            copy[i] = arrayWithNumbers[i];
        }
        return copy;
    }

    public void setArrayWithNumbers(int[] arrayWithNumbers1) {
        arrayWithNumbers = new int[arrayWithNumbers1.length];

        for (int i = 0; i < arrayWithNumbers.length; i++) {
            arrayWithNumbers[i] = arrayWithNumbers1[i];
        }
    }

    public CountSor(int[] arrayNum) {
        setArrayWithNumbers(arrayNum);
    }

    public int getMaxValue() {
        int max = arrayWithNumbers[0];
        for (int j = 1; j < arrayWithNumbers.length; j++) {
            if (max < arrayWithNumbers[j]) {
                max = arrayWithNumbers[j];
            }
        }

        return max;
    }

    public int[] countingSort() {
        int k = getMaxValue();
        int counts[] = new int[k + 1];
        int[] sortedArray = new int[arrayWithNumbers.length];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        for (int j = 0; j < arrayWithNumbers.length; j++) {
            counts[arrayWithNumbers[j]]++;
        }

        for (int i = 1; i <= k; i++) {
            counts[i] = counts[i] + counts[i - 1];

        }
        for (int j = arrayWithNumbers.length - 1; j >= 0; j--) {
            sortedArray[counts[arrayWithNumbers[j]] - 1] = arrayWithNumbers[j];
            counts[arrayWithNumbers[j]] = counts[arrayWithNumbers[j]] - 1;
        }
        return sortedArray;
    }
}
