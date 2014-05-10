package ApplicationAboutSort;

public class CountSort {

    private int[] intArr;

    public void setIntArr(int[] array) {
        if (array != null) {
            intArr = new int[array.length];
            for (int i = 0; i < intArr.length; i++) {
                if (array[i] > 0) {
                    intArr[i] = array[i];
                } else {
                    System.err.print("Trqbva da imate samo polojitelni chisla!");
                }
            }
        }
    }

    public int[] getIntArr() {
        return intArr;
    }

    public CountSort(int array[]) {
        setIntArr(array);
    }

    public StringBuilder toString1() {
        String result = "";
        StringBuilder obj = new StringBuilder(result);
        for (int counter = 0; counter < intArr.length; counter++) {
            obj.append(String.format("%d ", intArr[counter]));
        }
        return obj;
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

    public int[] countingSort() {
        int k = getMaxValue();
        int counts[] = new int[k + 1];
        int[] sortedArray = new int[intArr.length];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        for (int j = 0; j < intArr.length; j++) {
            counts[intArr[j]]++;           
        }

        for (int i = 1; i <= k; i++) {
            counts[i] = counts[i] + counts[i - 1];

        }
        for (int j = intArr.length - 1; j >= 0; j--) {
            sortedArray[counts[intArr[j]] - 1] = intArr[j];
            counts[intArr[j]] = counts[intArr[j]] - 1;
        }
        return sortedArray;
    }
}
