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
    protected int row;
    protected int kolum;
    Playfield playfield;
  
    public void paint(Graphics2D g2) {
        
    }

    public void tick() {
    }
    public void setPlayfield(Playfield pf){
        playfield = pf;
    }
    public int getRow(){
        return row;
    }
    public int getKolum(){
        return kolum;
    }
}
