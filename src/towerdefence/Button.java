/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefence;

import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author Glenn Latomme <glenn.latomme@gmail.com>
 */
public class Button {
    int Xpos, Ypos;
    Point MousePos;
    Image image, ImageHover;
    public Button(int Xpos, int Ypos, String ImageLoaction, String ImageLoactionHover){
        // init
        this.Xpos = Xpos;
        this.Ypos = Ypos;
        try {
            image = ImageIO.read(new File(ImageLoaction));
        } catch (IOException e) { 
            System.out.println(e.getMessage());
            System.out.println("I'm located at:" + System.getProperty("user.dir"));
        }
        try {
            ImageHover = ImageIO.read(new File(ImageLoactionHover));
        } catch (IOException e) { 
            System.out.println(e.getMessage());
        }
    }
    public void paint(Graphics g){
        if (hoverover(MouseInfo.getPointerInfo().getLocation()) )
            g.drawImage(ImageHover, Xpos, Ypos, null);
        else 
            g.drawImage(image, Xpos, Ypos, null);
    }
    public boolean hoverover(double Xpos, double Ypos){
        boolean returnAnswer = false;
        if (Xpos >= this.Xpos && Xpos <= this.Xpos+image.getWidth(null))
            if (Ypos >= this.Ypos && Ypos <= this.Ypos+image.getHeight(null))
                returnAnswer = true;
        return returnAnswer;
    }
    public boolean hoverover(Point Pos){
        if (Pos != null)
            return hoverover(Pos.getX(), Pos.getY());
        else return false;
    }
}
