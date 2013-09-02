/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sun.java2d.loops.DrawLine;

/**
 *
 * @author Jelin
 */
public class LineDrawing extends javax.swing.JPanel {

    private Color colorOfLine;

    public Color getColorOfLine() {
        return colorOfLine;
    }

    public void setColorOfLine(Color colorOfLine) {
        this.colorOfLine = colorOfLine;
    }
    
    public LineDrawing(Color color){
        setColorOfLine(color);
    }

    public LineDrawing() {
        initComponents();
    }

    public void paint(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        g.drawLine(0,0, width, height);
        g.setColor(colorOfLine);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
