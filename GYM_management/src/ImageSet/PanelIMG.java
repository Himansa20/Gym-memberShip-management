package ImageSet;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelIMG extends JPanel {

    Image Bgimg;

    public PanelIMG() {
        Bgimg = new ImageIcon(getClass().getResource("/Interfaces/bg3.jpg")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(Bgimg, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}


