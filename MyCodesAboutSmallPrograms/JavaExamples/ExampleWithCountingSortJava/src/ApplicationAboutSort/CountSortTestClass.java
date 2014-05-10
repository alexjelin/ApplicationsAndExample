package ApplicationAboutSort;

import javax.swing.JOptionPane;

public class CountSortTestClass {

    public static void main(String[] args) {
        String numbers = JOptionPane.showInputDialog(null, "Vavedete chisla:");
        String[] numbers1 = numbers.split("\\s+");
        int arrayNum[] = new int[numbers1.length];

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(numbers1[i]);
        }

        CountSort obj = new CountSort(arrayNum);
        int[] sortedArr = obj.countingSort();
        CountSort obj2 = new CountSort(sortedArr);
        StringBuilder result = obj2.toString1();
        System.out.print(result);
    }
}
