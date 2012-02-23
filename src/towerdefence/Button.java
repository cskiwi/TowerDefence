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
    Font buttonFont;
    FontMetrics Metrics;
    String OutputText;
    int TextWidth;

    public Button(int Xpos, int Ypos, String Text) {
        // init
        this.Xpos = Xpos;
        this.Ypos = Ypos;
        OutputText = Text;
        buttonFont = new Font("Arial", Font.BOLD, 20);
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
        // @TODO Make dynamic buttons
        g2.setFont(buttonFont);
        g2.setColor(Color.red);
        Metrics = g2.getFontMetrics();
        TextWidth = Metrics.stringWidth(OutputText);

        // paint button
        if (hoverover(MouseInfo.getPointerInfo().getLocation())) {
            g2.drawImage(ImageHover, Xpos, Ypos, null);
        } else {
            g2.drawImage(Image, Xpos, Ypos, null);
        }

        // Set text
        g2.drawString(OutputText, Xpos + Image.getWidth(null) / 2 - TextWidth / 2, Ypos + Image.getHeight(null) / 2 + g2.getFont().getSize() / 2 - 5);
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
