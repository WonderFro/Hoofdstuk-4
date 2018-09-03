import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRoundRect(20, 20, 100, 50, 10, 10);
        g.fillRect(20, 80, 100, 50);
        g.drawOval(20, 140, 50, 100);
        g.drawArc(80, 160, 100, 50, 90, 45);
        g.fillArc(120, 20, 100, 50, 90, 45);
    }
}
