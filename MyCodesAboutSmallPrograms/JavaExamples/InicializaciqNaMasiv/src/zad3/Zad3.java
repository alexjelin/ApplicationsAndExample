/*
 * konzolno prilojenie za inicializirane na masiv s 10 elementa ;
 */
package zad3;

import javax.swing.JOptionPane;

public class Zad3 {

    public static String sayMqu() {
        String text;
        text = "Mqyyy";
        return text;
    }

    public static void main(String[] args) {
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = "cat" + i;
        }
        for (int i = 0; i < 10; i++) {
            String text = String.format("%s %s", array[i], sayMqu());
            JOptionPane.showMessageDialog(null, text);
        }
        
    }
}
