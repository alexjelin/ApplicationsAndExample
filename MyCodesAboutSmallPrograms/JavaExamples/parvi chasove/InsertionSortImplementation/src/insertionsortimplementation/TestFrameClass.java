package insertionsortimplementation;

import javax.swing.JFrame;

public class TestFrameClass {

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        FrameSwingForm panel = new FrameSwingForm();
        fr.add(panel);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 250);
        fr.setVisible(true);
    }
}
