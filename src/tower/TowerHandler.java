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
public class TowerHandler {
    
    private static final int TOWERS = 50;
    Tower[] Towers = new Tower[TOWERS];
    int ActiveTowers = 0;
    Playfield playfield;
    
    public TowerHandler() {
        for (int i = 0; i < TOWERS; i++) {
            Towers[i] = null;
        }
    }
    
    public void tick() {
        for (int i = 0; i < ActiveTowers; i++) {
            if (Towers[i] != null) {
                Towers[i].tick();
            }
        }
    }
    
    public void paint(Graphics2D g2) {
        for (int i = 0; i < ActiveTowers; i++) {
            if (Towers[i] != null) {
                Towers[i].paint(g2);
            }
        }
    }
    
    public void addTower(Point2D.Double pt) {
        boolean doIt = true;
        Tower tempTower = new BasicTower(pt, playfield);
        for (int i = 0; i < ActiveTowers; i++) {
            if (Towers[i].getVerticalNr() == tempTower.getVerticalNr() && Towers[i].getVerticalNr() == tempTower.getVerticalNr()) {
                doIt = false;
            }
        }
        if(tempTower.getVerticalNr() == -1 || tempTower.getVerticalNr() == -1){
            doIt = false;
        }
        if (doIt) {
            Towers[ActiveTowers] = tempTower;
            if (ActiveTowers < TOWERS) {
                ActiveTowers++;
            }
        }
        System.out.println("Active towers: " + getActiveTowers());
    }
    
    public int getActiveTowers() {
        return ActiveTowers;
    }

    public void setPlayfield(Playfield pf) {
        playfield = pf;
    }
}
