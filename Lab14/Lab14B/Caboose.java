import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;


 class Caboose extends RailCar
{
    private Color carColor;
    public int xPos;
    private int yPos;

    public Caboose(Color cC, int xPos, int yPos)
    {
        super(cC,xPos,yPos);
        carColor = cC;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void drawCar(Graphics g)
    {
        super.drawCar(g);
        drawWindows(g);
        drawCupola(g);
    }

    private void drawWindows(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(xPos+30,yPos+30,30,30);
        g.fillRect(xPos+90,yPos+30,30,30);
    }

    private void drawCupola(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(xPos+30,yPos-30,90,30);
        g.setColor(Color.black);
        g.fillRect(xPos+25,yPos-30,100,5);
    }
    public void addXPos(int add) {
        this.xPos += add;
        super.addXPos(add);
    }
}