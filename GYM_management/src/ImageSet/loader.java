/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImageSet;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Thathsara
 */
public class loader extends JPanel {
    Image loaderimg;
    
    public loader(){
    loaderimg = new ImageIcon(getClass().getResource("/Images/loading.jpg")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(loaderimg, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
