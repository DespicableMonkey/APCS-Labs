import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;


class Locomotive extends RailCar
{
    private Color carColor;
    public int xPos;
    private int yPos;

    public Locomotive(Color cC, int xPos, int yPos)
    {
        super(cC,xPos,yPos);
        carColor = cC;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void drawCar(Graphics g)
    {
        super.drawCar(g);
        drawScoop(g);
        drawFunnel(g);
    }

    private void drawScoop(Graphics g)
    {
        Polygon scoop = new Polygon();
        scoop.addPoint(xPos,yPos+50);
        scoop.addPoint(xPos,yPos+100);
        scoop.addPoint(xPos-50,yPos+100);
        g.setColor(Color.black);
        g.fillPolygon(scoop);
    }

    private void drawFunnel(Graphics g)
    {
        Polygon funnel = new Polygon();
        funnel.addPoint(xPos+20,yPos);
        funnel.addPoint(xPos+20,yPos-30);
        funnel.addPoint(xPos,yPos-50);
        funnel.addPoint(xPos,yPos-60);
        funnel.addPoint(xPos+60,yPos-60);
        funnel.addPoint(xPos+60,yPos-50);
        funnel.addPoint(xPos+40,yPos-30);
        funnel.addPoint(xPos+40,yPos);
        g.setColor(Color.black);
        g.fillPolygon(funnel);
    }
    public void addXPos(int add) {
        this.xPos += add;
        super.addXPos(add);
    }
}