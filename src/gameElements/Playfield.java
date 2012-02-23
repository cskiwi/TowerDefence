/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gameElements;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Glenn Latomme <glenn.latomme@gmail.com>
 */
public class Playfield {

    int Initial_Xpos, Initial_Ypos;
    public static final int FIELDWIDTH = 800;
    public static final int FIELDHEIGTH = 600;
    public static final int SQUAREWIDTH = 50;
    int Kolums = FIELDWIDTH / SQUAREWIDTH;
    int Rows = FIELDHEIGTH / SQUAREWIDTH;
    Point2D.Double[][] FieldArr = new Point2D.Double[Rows][Kolums];

    public Playfield(int Xpos, int Ypos) {
        Initial_Xpos = Xpos;
        Initial_Ypos = Ypos;
        for (int r = 0; r < Rows; r++) {
            for (int k = 0; k < Kolums; k++) {
                FieldArr[r][k] = new Point2D.Double(k * SQUAREWIDTH + Initial_Xpos, r * SQUAREWIDTH + Initial_Ypos);
            }
        }
    }

    public void tick() {
    }

    public void paint(Graphics2D g2) {
        for (int r = 0; r < Rows; r++) {
            for (int k = 0; k < Kolums; k++) {
                g2.drawRect((int) FieldArr[r][k].getX(), (int) FieldArr[r][k].getY(), SQUAREWIDTH, SQUAREWIDTH);
            }
        }
    }

    public Point2D.Double getSquarePos(int xPos, int yPos) {
        Point2D.Double pt = new Point2D.Double(-1, -1);
        for (int r = 0; r < Rows; r++) {
            for (int k = 0; k < Kolums; k++) {
                if (xPos > FieldArr[r][k].getX() && xPos < FieldArr[r][k].getX() + SQUAREWIDTH) {
                    if (yPos > FieldArr[r][k].getY() && yPos < FieldArr[r][k].getY() + SQUAREWIDTH) {
                        pt = FieldArr[r][k];
                    }
                }
            }
        }
        return pt;
    }

    //Getters
    public int getSquarewidth() {
        return SQUAREWIDTH;
    }

    public int getKolumNR(int Xpos) {
        return Xpos / SQUAREWIDTH - Initial_Xpos / SQUAREWIDTH + 1;
    }

    public int getRowNR(int Ypos) {
        return Ypos / SQUAREWIDTH - Initial_Ypos / SQUAREWIDTH + 1;
    }
}
