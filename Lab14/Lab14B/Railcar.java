import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;


class RailCar
{
    private Color carColor;
    public int xPos;
    private int yPos;

    public RailCar(Color cC, int xP, int yP)
    {
        carColor = cC;
        xPos = xP;
        yPos = yP;
    }

    public void drawCar(Graphics g)
    {
        drawContainer(g);
        drawRailWheels(g);
        drawLink(g);
    }

    private void drawContainer(Graphics g)
    {
        g.setColor(carColor);
        g.fillRect(xPos,yPos,150,100);
    }

    private void drawRailWheels(Graphics g)
    {
        g.setColor(Color.black);
        g.fillOval(xPos+5,yPos+75,50,50);
        g.fillOval(xPos+95,yPos+75,50,50);
    }

    private void drawLink(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(xPos-25,yPos+80,25,5);
    }
    public void addXPos(int add) { this.xPos += add; }
}
