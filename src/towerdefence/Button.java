/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefence;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Glenn Latomme <glenn.latomme@gmail.com>
 */
public class Button {

    int Xpos, Ypos;
    Point MousePos;
    Image Image, ImageHover;
    URL urlImage;
    URL urlImageHover;
    
    public Button(int Xpos, int Ypos) {
        // init
        this.Xpos = Xpos;
        this.Ypos = Ypos;
        urlImage = this.getClass().getResource("/img/Quit.png");
        urlImageHover = this.getClass().getResource("/img/QuitHover.png");
        
        try {
            Image = ImageIO.read(urlImage);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("I'm located at:" + System.getProperty("user.dir"));
        }

        try {
            ImageHover = ImageIO.read(urlImageHover);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void paint(Graphics2D g2) {
        if (hoverover(MouseInfo.getPointerInfo().getLocation())) {
            g2.drawImage(ImageHover, Xpos, Ypos, null);
        } else {
            g2.drawImage(Image, Xpos, Ypos, null);
        }
    }

    public boolean hoverover(double Xpos, double Ypos) {
        boolean returnAnswer = false;
        if (Xpos >= this.Xpos && Xpos <= this.Xpos + Image.getWidth(null)) {
            if (Ypos >= this.Ypos && Ypos <= this.Ypos + Image.getHeight(null)) {
                returnAnswer = true;
            }
        }
        return returnAnswer;
    }

    public boolean hoverover(Point Pos) {
        if (Pos != null) {
            return hoverover(Pos.getX(), Pos.getY());
        } else {
            return false;
        }
    }
}
