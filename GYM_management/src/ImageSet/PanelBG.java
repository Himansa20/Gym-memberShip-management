/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImageSet;

/**
 *
 * @author Thathsara
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelBG extends JPanel {

    Image Bgimg;

    public PanelBG() {
        Bgimg = new ImageIcon(getClass().getResource("/Interfaces/register.png")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(Bgimg, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}

