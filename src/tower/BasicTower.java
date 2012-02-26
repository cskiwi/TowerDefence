/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tower;

import gameElements.Playfield;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Glenn Latomme <glenn.latomme@gmail.com>
 */
public class BasicTower extends Tower {

    public BasicTower(Point2D.Double pt, Playfield pf) {
        this.playfield = pf;
        VerticalNr = playfield.getVertNR((int) pt.getY());
        HorizontalNr = playfield.getHorNR((int) pt.getX());
    }

    @Override
    public void paint(Graphics2D g2) {
        int Xpos = HorizontalNr * playfield.getSquarewidth() + playfield.GetinitialXPos();
        int Ypos = VerticalNr * playfield.getSquarewidth() + playfield.GetinitialYPos();
        g2.fillRect(Xpos, Ypos, 50, 50);
    }
}
