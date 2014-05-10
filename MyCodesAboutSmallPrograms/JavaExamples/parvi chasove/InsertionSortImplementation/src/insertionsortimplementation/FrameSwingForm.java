package insertionsortimplementation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameSwingForm extends JPanel {

    public int[] insertionSort(int[] data) {
        int insert;
        for (int i = 1; i < data.length; i++) {
            insert = data[i];
            int moveItem = i;

            while (moveItem > 0 && data[moveItem - 1] > insert) {
                data[moveItem] = data[moveItem - 1];
                moveItem--;
            }

            data[moveItem] = insert;
            moveItem--;
        }
        return data;
    }
    private JTextField inputUserNumbers;

    public FrameSwingForm() {
        JLabel lblForDescription = new JLabel("Vavedete nqkolko chisla za sortirane po Insertion sort:");
        JButton btnExicute = new JButton("Exucute");
        JButton btnExit = new JButton("Exit");

        inputUserNumbers = new JTextField(100);

        btnExit.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numbersOfUser = inputUserNumbers.getText();
                String[] numbers = numbersOfUser.split("\\s+");
                int[] intNumbers = new int[numbers.length];
                for (int counter = 0; counter < numbers.length; counter++) {
                    intNumbers[counter] = Integer.parseInt(numbers[counter]);
                }

                int[] result = insertionSort(intNumbers);
                String result1 = "";
                for (int i = 0; i < result.length; i++) {
                    result1 += String.format("%d ", result[i]);
                }

                inputUserNumbers.setText(result1);
            }
        });

        btnExicute.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });


        this.add(inputUserNumbers);
        this.add(lblForDescription);
        this.add(btnExicute);
        this.add(btnExit);
    }
}
