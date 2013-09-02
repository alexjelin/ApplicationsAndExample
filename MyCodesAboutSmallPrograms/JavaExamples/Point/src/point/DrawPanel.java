package point;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    private Random randomNumbers = new Random();
    private Line lines[];

    public DrawPanel() {
        setBackground(Color.WHITE);
        lines = new Line[5 + randomNumbers.nextInt(5)];

        for (int i = 0; i < lines.length; i++) {
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            
            Color color=new Color(randomNumbers.nextInt(256),randomNumbers.nextInt(256)
                    ,randomNumbers.nextInt(256));
            
            lines[i]=new Line(); // nedovyrsheno uslovie!
        }
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(Line line:lines){
            line.draw(g);
        }    
    }
}
