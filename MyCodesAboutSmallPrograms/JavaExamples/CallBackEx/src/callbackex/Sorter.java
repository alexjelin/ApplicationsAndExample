package callbackex;

public class Sorter {

    private int[] arrToSort;

    public void setArrToSort(int[] array) {
        try {
            arrToSort = new int[array.length];
            for (int i = 0; i < arrToSort.length; i++) {
                arrToSort[i] = array[i];
            }
        } catch (Exception e) {
            throw new NullPointerException("Imate nepravilni danni!");
        }
    }

    public int[] getArrToSort() {
        int copy[] = new int[arrToSort.length];
        for (int i = 0; i < arrToSort.length; i++) {
            copy[i] = arrToSort[i];
        }
        return copy;
    }

    public Sorter(int[] numbersArray) {
        setArrToSort(numbersArray);
    }

    @Override
    public String toString() {
        String result = "";
        for (int index = 0; index < arrToSort.length; index++) {
            result += String.format("%d ", arrToSort[index]);
        }
        return result;
    }

    class BubbleSort implements ISortable {
        public int[] sort() {
            for (int pass = 1; pass < arrToSort.length; pass++) {
                for (int index = 0; index < arrToSort.length - 1; index++) {
                    if (arrToSort[index] > arrToSort[index + 1]) {
                        int temp = arrToSort[index];
                        arrToSort[index] = arrToSort[index + 1];
                        arrToSort[index + 1] = temp;
                    }
                }
            }
            return arrToSort;
        }

        public BubbleSort getBubbleSOortObj() {
            return new BubbleSort();
        }
    }
}
