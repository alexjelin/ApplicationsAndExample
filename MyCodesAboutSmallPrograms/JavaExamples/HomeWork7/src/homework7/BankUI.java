package homework7;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankUI extends JPanel {

    private JLabel[] labels;
    private JTextField[] fields;
    private JButton btnOne;
    private JPanel southP;
    private JPanel centralP;
    private String[] textForLabels;

    public BankUI(String[] textForLabels) {
        labels = new JLabel[4];
        fields = new JTextField[labels.length];
        textForLabels = new String[labels.length];
    }

    public void setTextOnLabels() {
        for (int i = 0; i < labels.length; i++) {
            labels[i].setText(textForLabels[i]);
        }
    }

    public JTextField[] getFields() {
        JTextField[] copy = new JTextField[fields.length];
        for (int i = 0; i < fields.length; i++) {
            copy[i] = fields[i];
        }
        return copy;
    }

    public JButton getButtonOne() {
        return btnOne;
    }
    
    
}
