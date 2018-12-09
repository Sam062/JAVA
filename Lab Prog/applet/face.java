import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class face extends Applet {
    public void init() {
        // Here we change the default grey color background of an 
        // applet to yellow background.
        setBackground(Color.YELLOW);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Applet background example", 150, 50);
    }
}