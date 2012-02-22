/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefence;
import java.awt.*;
import java.awt.event.KeyEvent;
/**
 *
 * @author Kiwi
 */
public class Main extends javax.swing.JFrame {    /**
     * Creates new form Main
     */
    private Field field;
    public boolean Keypressed = false;
    
    public Main() {
           initComponents();
           field = new Field();
           overlayMenu1.setVisible(Keypressed);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field1 = new towerdefence.Field();
        overlayMenu1 = new towerdefence.OverlayMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TowerDefence");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Frame");
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        setResizable(false);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        field1.setName("Field");
        field1.setPreferredSize(new java.awt.Dimension(5000, 5000));

        javax.swing.GroupLayout field1Layout = new javax.swing.GroupLayout(field1);
        field1.setLayout(field1Layout);
        field1Layout.setHorizontalGroup(
            field1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5000, Short.MAX_VALUE)
        );
        field1Layout.setVerticalGroup(
            field1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );

        getContentPane().add(field1);
        field1.setBounds(0, 0, 5000, 5000);

        overlayMenu1.setBackground(new java.awt.Color(0, 0, 0));
        overlayMenu1.setMinimumSize(new java.awt.Dimension(100, 100));
        overlayMenu1.setPreferredSize(new java.awt.Dimension(5000, 5000));

        javax.swing.GroupLayout overlayMenu1Layout = new javax.swing.GroupLayout(overlayMenu1);
        overlayMenu1.setLayout(overlayMenu1Layout);
        overlayMenu1Layout.setHorizontalGroup(
            overlayMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5000, Short.MAX_VALUE)
        );
        overlayMenu1Layout.setVerticalGroup(
            overlayMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5000, Short.MAX_VALUE)
        );

        getContentPane().add(overlayMenu1);
        overlayMenu1.setBounds(0, 0, 5000, 5000);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // Pop's up Ingame menu
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            if (Keypressed) Keypressed = false;
            else Keypressed = true;
            overlayMenu1.setVisible(Keypressed);
            repaint();
        }        
    }//GEN-LAST:event_formKeyPressed
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    }//GEN-LAST:event_formMouseClicked
   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
          });
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private towerdefence.Field field1;
    private towerdefence.OverlayMenu overlayMenu1;
    // End of variables declaration//GEN-END:variables
}
