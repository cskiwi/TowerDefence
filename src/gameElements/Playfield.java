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
    private static final int FIELDWIDTH = 800;
    private static final int FIELDHEIGTH = 600;
    private static final int SQUAREWIDTH = 50;
    int Horizontal = FIELDWIDTH / SQUAREWIDTH;
    int Vertical = FIELDHEIGTH / SQUAREWIDTH;
    Point2D.Double[][] FieldArr = new Point2D.Double[Vertical][Horizontal];

    public Playfield(int Xpos, int Ypos) {
        Initial_Xpos = Xpos;
        Initial_Ypos = Ypos;
        for (int h = 0; h < Vertical; h++) {
            for (int v = 0; v < Horizontal; v++) {
                FieldArr[h][v] = new Point2D.Double(v * SQUAREWIDTH + Initial_Xpos, h * SQUAREWIDTH + Initial_Ypos);
            }
        }
    }

    public void tick() {
    }

    public void paint(Graphics2D g2) {
        for (int h = 0; h < Vertical; h++) {
            for (int v = 0; v < Horizontal; v++) {
                g2.drawRect((int) FieldArr[h][v].getX(), (int) FieldArr[h][v].getY(), SQUAREWIDTH, SQUAREWIDTH);
            }
        }
    }

    public Point2D.Double getSquarePos(int xPos, int yPos) {
        Point2D.Double pt = new Point2D.Double(-1, -1);
        for (int h = 0; h < Vertical; h++) {
            for (int v = 0; v < Horizontal; v++) {
                if (xPos > FieldArr[h][v].getX() && xPos < FieldArr[h][v].getX() + SQUAREWIDTH) {
                    if (yPos > FieldArr[h][v].getY() && yPos < FieldArr[h][v].getY() + SQUAREWIDTH) {
                        pt = FieldArr[h][v];
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

    public int getHorNR(int Ypos) {
        int returnHorz = 0;

        returnHorz = (Ypos - Initial_Ypos) / SQUAREWIDTH;
        if (returnHorz < 0) {
            returnHorz = -1;
        } else if (returnHorz >= Horizontal) {
            returnHorz = -1;
        }
        return returnHorz;
    }

    public int getVertNR(int Xpos) {
        int returnVert = 0;
        returnVert = (Xpos - Initial_Xpos) / SQUAREWIDTH;
        if (returnVert < 0) {
            returnVert = -1;
        } else if (returnVert >= Vertical) {
            returnVert = -1;
        }
        return returnVert;
    }

    public int GetinitialXPos() {
        return Initial_Xpos;
    }

    public int GetinitialYPos() {
        return Initial_Ypos;
    }
}
