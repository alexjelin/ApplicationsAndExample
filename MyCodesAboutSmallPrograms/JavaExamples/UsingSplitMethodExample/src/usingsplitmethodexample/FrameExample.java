package usingsplitmethodexample;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameExample extends JPanel {
    
    public static int[] bubbleSort(int[] arr) {
        for (int pass = 1; pass < arr.length; pass++) {
            for (int index = 0; index < arr.length - 1; index++) {
                if (arr[index] > arr[index + 1]) {
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
        }
        return arr;
    }
    private JTextField txtInputForNumbers, txtResult;
    
    public FrameExample() {
        JLabel descrInput = new JLabel("Vavedete nqkolko chisla po izbor:");
        JLabel lblresult = new JLabel("Sortirani chislata sa:");
        
        JButton btnSort = new JButton("Sortirai!");
        JButton btnExit = new JButton("Exit!");
        txtInputForNumbers = new JTextField(55);
        txtResult = new JTextField(55);
        
        btnSort.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numbers = txtInputForNumbers.getText().split("\\s+");
                String results = "";
                int[] parsingStringArray = new int[numbers.length];
                for (int i = 0; i < parsingStringArray.length; i++) {
                    parsingStringArray[i] = Integer.parseInt(numbers[i]);
                }
                StringBuilder bilder = new StringBuilder(results);
                int[] sortArrWithNumbers = bubbleSort(parsingStringArray);
                
                String resultsWithSortNumbers = "";
                for (int i = 0; i < sortArrWithNumbers.length; i++) {
                    resultsWithSortNumbers += String.format("%d ", sortArrWithNumbers[i]);
                }
                bilder.append(resultsWithSortNumbers);
                
                txtResult.setText(resultsWithSortNumbers);
                
            }
        });
        
        this.add(txtInputForNumbers);
        this.add(lblresult);
        this.add(txtResult);
        this.add(btnSort);
        this.add(btnExit);
    }
}
