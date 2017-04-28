import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Erixon on 28.04.2017.
 */
public class App extends Applet implements MouseListener{
    int x =100;
    int y = 100;

    @Override
    public void init() {
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g){
        g.drawString("o", x,y);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        if (mouseX > this.x) x += 5;
        else x -= 5;
        if (mouseY > this.y) y += 5;
        else y -= 5;
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
