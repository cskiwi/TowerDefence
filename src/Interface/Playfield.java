/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Glenn Latomme <glenn.latomme@gmail.com>
 */
public class Playfield {

    public static final int FIELDWIDTH = 800;
    public static final int FIELDHEIGTH = 600;
    public static final int SQUAREWIDTH = 50;
    double LocationLoactionLocation = 105;
    double speed = .1;

    public void Playfield() {
    }

    public void tick() {
        // testing some shit
        LocationLoactionLocation += speed;
        if (LocationLoactionLocation >= 600) {
            speed *= -1;
        } else if (LocationLoactionLocation <= 100) {
            speed *= -1;
        }
    }

    public void paint(Graphics g) {

        int Initial_Xpos = 100, Initial_Ypos = 100;
        int Kolums = FIELDWIDTH / SQUAREWIDTH;
        int Rows = FIELDHEIGTH / SQUAREWIDTH;

        for (int k = 0; k < Kolums; k++) {
            for (int r = 0; r < Rows; r++) {
                g.drawRect(SQUAREWIDTH * k + Initial_Xpos, SQUAREWIDTH * r + Initial_Ypos, SQUAREWIDTH + Initial_Xpos, SQUAREWIDTH + Initial_Ypos);
            }
        }

        // testing some shit
        g.setColor(Color.black);
        g.drawRect((int)LocationLoactionLocation, 100, 20, 22);
    }
}
