package zad1week15;

import javax.swing.JApplet;

public class CircleClass extends JApplet {
    
    public CircleClass() {
        NewJPanel t = new NewJPanel();
        add(t);        
    }    
    
    public void unit() {
        this.setSize(900, 150);
    }
}
