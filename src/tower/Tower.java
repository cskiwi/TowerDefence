/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tower;

import gameElements.Playfield;
import java.awt.Graphics2D;

/**
 *
 * @author Glenn Latomme <glenn.latomme@gmail.com>
 */

public class Tower {
    protected int HorizontalNr;
    protected int VerticalNr;
    Playfield playfield;
  
    public void paint(Graphics2D g2) {
        
    }

    public void tick() {
    }
    public void setPlayfield(Playfield pf){
        playfield = pf;
    }
    public int getHorizontalNr(){
        return HorizontalNr;
    }
    public int getVerticalNr(){
        return VerticalNr;
    }
}
