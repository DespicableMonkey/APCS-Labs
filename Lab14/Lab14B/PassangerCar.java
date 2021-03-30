import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;


class PassengerCar extends RailCar
{
    private Color carColor;
    public int xPos;
    private int yPos;

    public PassengerCar(Color cC, int xPos, int yPos)
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
        drawRoof(g);
    }

    private void drawWindows(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(xPos+10,yPos+30,25,30);
        g.fillRect(xPos+45,yPos+30,25,30);
        g.fillRect(xPos+80,yPos+30,25,30);
        g.fillRect(xPos+115,yPos+30,25,30);
    }

    private void drawRoof(Graphics g)
    {
        Polygon roof = new Polygon();
        roof.addPoint(xPos-15,yPos+20);
        roof.addPoint(xPos,yPos);
        roof.addPoint(xPos+150,yPos);
        roof.addPoint(xPos+165,yPos+20);
        g.setColor(carColor);
        g.fillPolygon(roof);
    }
    public void addXPos(int add) {
        this.xPos += add;
        super.addXPos(add);
    }
}