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

public class paymentBg extends JPanel {

    Image paybg;

    public paymentBg() {
        paybg = new ImageIcon(getClass().getResource("/Interfaces/5568517_2879855.jpg")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(paybg, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
