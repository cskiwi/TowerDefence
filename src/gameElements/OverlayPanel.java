/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameElements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import towerdefence.Button;

/**
 *
 * @author Glenn Latomme <glenn.latomme@gmail.com>
 */
public class OverlayPanel {

    Color Background = new Color(0, 0, 0, 100);
    int Width = Toolkit.getDefaultToolkit().getScreenSize().width;;
    int Height = Toolkit.getDefaultToolkit().getScreenSize().height;;
    Button btnQuit = new Button(Width / 2 - 50, Height / 2 - 15);

    public void OverlayPanel() {

    }
    public void tick() {
        
    }
    public void paint(Graphics2D g2) {
        g2.setColor(Background);
        // Draw
        g2.fillRect(0, 0, Width, Height);
        btnQuit.paint(g2);
    }
    public void MouseClicked(java.awt.event.MouseEvent evt){
        if (btnQuit.hoverover(evt.getX(), evt.getY())){
            System.exit(0);
        }
    }
}
