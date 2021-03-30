import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;


class FreightCar extends RailCar
{
    private Color carColor;
    public int xPos;
    private int yPos;

    public FreightCar(Color cC, int xPos, int yPos)
    {
        super(cC,xPos,yPos);
        carColor = cC;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void drawCar(Graphics g)
    {
        super.drawCar(g);
        drawFreightDoors(g);
    }

    private void drawFreightDoors(Graphics g)
    {
        g.setColor(Color.black);
        g.drawRect(xPos+30,yPos+10,90,60);
        g.drawLine(xPos+75,yPos+10,xPos+75,yPos+70);
        g.drawLine(xPos+30,yPos+10,xPos+75,yPos+70);
        g.drawLine(xPos+30,yPos+70,xPos+75,yPos+10);
        g.drawLine(xPos+75,yPos+10,xPos+120,yPos+70);
        g.drawLine(xPos+75,yPos+70,xPos+120,yPos+10);
        g.fillRect(xPos+66,yPos+35,5,15);
        g.fillRect(xPos+80,yPos+35,5,15);
    }
    public void addXPos(int add) {
        this.xPos += add;
        super.addXPos(add);
    }

}