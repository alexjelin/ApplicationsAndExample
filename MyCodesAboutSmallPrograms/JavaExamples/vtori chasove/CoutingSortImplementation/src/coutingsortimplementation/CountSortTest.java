package coutingsortimplementation;

import javax.swing.JOptionPane;

public class CountSortTest {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Vavedete nqkolko chisla za sortirane:");
        String[] numbers = input.split("\\s+");
        int arrayNum[] = new int[numbers.length];

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(numbers[i]);

            while (arrayNum[i] < 0) {
                String input1 = JOptionPane.showInputDialog("Vavedete polojitelno tekushto chislo!");
                String[] numbers2 = input1.split("\\s+");
                arrayNum[i] = Integer.parseInt(numbers2[0]);
            }
        }
        CountSor test = new CountSor(arrayNum);
        int[] neshtosi = test.countingSort();

        for (int i = 0; i < neshtosi.length; i++) {
            System.out.printf("%d ", neshtosi[i]);
        }
    }
}
