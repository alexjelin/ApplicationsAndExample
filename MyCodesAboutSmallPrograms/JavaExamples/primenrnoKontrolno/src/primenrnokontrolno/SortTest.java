package primenrnokontrolno;

import javax.swing.JOptionPane;

public class SortTest {

    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Vavedete nqkoko chisla s interval");
        String numbers[] = userInput.split("\\s+");
        int[] array = new int[numbers.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        MySort obj = new MySort(2);
        int[] sortArr = obj.sort(array);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sortArr.length; i++) {
            result.append(String.format("%d ", sortArr[i]));
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
