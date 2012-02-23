/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameElements;

import java.awt.Graphics2D;

/**
 *
 * @author Glenn Latomme <glenn.latomme@gmail.com>
 */
public class Playfield {

    public static final int FIELDWIDTH = 800;
    public static final int FIELDHEIGTH = 600;
    public static final int SQUAREWIDTH = 50;

    public void Playfield() {
    }

    public void tick() {

    }

    public void paint(Graphics2D g2) {

        int Initial_Xpos = 100, Initial_Ypos = 100;
        int Kolums = FIELDWIDTH / SQUAREWIDTH;
        int Rows = FIELDHEIGTH / SQUAREWIDTH;

        for (int k = 0; k < Kolums; k++) {
            for (int r = 0; r < Rows; r++) {
                g2.drawRect(SQUAREWIDTH * k + Initial_Xpos, SQUAREWIDTH * r + Initial_Ypos, SQUAREWIDTH, SQUAREWIDTH);
            }
        }
    }
}
