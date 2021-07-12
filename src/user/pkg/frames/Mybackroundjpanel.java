package user.pkg.frames;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Mybackroundjpanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage img;

    public Mybackroundjpanel(String imgpath) {
        // load the background image
        try {
        	InputStream is = this.getClass().getResourceAsStream(imgpath);
            this.img = ImageIO.read(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // paint the background image and scale it to fill the entire space
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}
