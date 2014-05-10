package homework6;

import javax.swing.JOptionPane;

public class TestClassForApplication {

    public static void main(String[] args) {
        String inputTxt = JOptionPane.showInputDialog("Vavedete nqkolko chisla s interval!");
        String[] arr = inputTxt.split("\\s");
        int[] numbers = new int[arr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        CountingSort test = new CountingSort(numbers);
        int sortedarr[] = test.countingSort();

        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result += String.format("%d ", numbers[i]);
        }

        JOptionPane.showMessageDialog(null, result);
        test.getFileWriter();
    }
}
