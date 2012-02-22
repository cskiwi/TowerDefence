/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefence;

import java.awt.*;

/**
 *
 * @author Glenn Latomme <glenn.latomme@gmail.com>
 */
public class Field extends javax.swing.JPanel {
    public static final int FIELDWIDTH  = 800;
    public static final int FIELDHEIGTH = 600;
    public static final int SQUAREWIDTH = 50;
    /**
     * Creates new form Field
     */
    public Field() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void formMouseClicked(java.awt.event.MouseEvent evt) {                                  
        
    }
    @Override
    public void paintComponent(Graphics g) {
        DrawField(g);
    }
    public void Tick(){
        
    }
    private void DrawField(Graphics g) {
        int Kolums = FIELDWIDTH / SQUAREWIDTH;
        int Rows = FIELDHEIGTH / SQUAREWIDTH;
        
        for (int k = 0; k < Kolums; k++){
            for (int r = 0; r < Kolums; r ++){
                g.drawRect(SQUAREWIDTH*k, SQUAREWIDTH*r, SQUAREWIDTH, SQUAREWIDTH);
            }           
        }        
    }
    
}