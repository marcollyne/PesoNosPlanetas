/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author karol
 */
public class Background extends javax.swing.JPanel {

    private ImageIcon bg;

    public Background() {
        bg = new ImageIcon();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        g.drawImage(bg.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
    }

    public ImageIcon getBg() {
        return bg;
    }

    public void setBg(ImageIcon bg) {
        this.bg = bg;
    }
}
