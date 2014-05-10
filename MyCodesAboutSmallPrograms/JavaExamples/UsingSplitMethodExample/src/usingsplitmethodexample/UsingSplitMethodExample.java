package usingsplitmethodexample;

import javax.swing.JFrame;

public class UsingSplitMethodExample {

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        FrameExample panel = new FrameExample();
        fr.add(panel);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 250);
        fr.setVisible(true);
    }
}
