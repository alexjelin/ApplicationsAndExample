package callbackexirciseinuniversity;

public class Sorter {

    private int[] arrNum;

    public int[] getArrNum() {
        return arrNum;
    }

    /* Pattern p=Pattern.complie();
     * Matcher m;
     * for(..)
     * m=p.matcher(element na masiva);
     * if(!m.matches)
     * {return false)
     * }
     */
    public void setArrNum(int[] arrNum1) {
        {
            int[] arrNum = new int[arrNum1.length];

            for (int i = 0; i < arrNum.length; i++) {
                arrNum[i] = arrNum1[i];
            }
        }
    }

    public Sorter(int[] exampleArr) {
        setArrNum(arrNum);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < arrNum.length; i++) {
            result = String.format("%d ", arrNum[i]);
        }
        return result;
    }

    public class InsertionSort implements ISortable {

        public int[] sort() {
            int insert;
            for (int i = 1; i < arrNum.length; i++) {
                insert = arrNum[i];
                int moveItem = i;

                while (moveItem > 0 && arrNum[moveItem - 1] > insert) {
                    arrNum[moveItem] = arrNum[moveItem - 1];
                    moveItem--;
                }

                arrNum[moveItem] = insert;
                moveItem--;
            }
            return arrNum;
        }
    }

    public class SelectionSort implements ISortable {

        public int[] sort() {
            for (int i = 0; i < arrNum.length - 1; i++) {
                for (int j = i + 1; j < arrNum.length; j++) {
                    if (arrNum[i] > arrNum[j]) {
                        int temp = arrNum[i];
                        arrNum[i] = arrNum[j];
                        arrNum[j] = temp;
                    }
                }
            }
            return arrNum;
        }
    }

    public ISortable insertionSortMethod() {
        return new InsertionSort();
    }

    public ISortable selectionSortMethod() {
        return new SelectionSort();
    }
}
