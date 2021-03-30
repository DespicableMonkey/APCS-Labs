import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Lab14avst gfx = new Lab14avst();
        gfx.setSize(980, 630);
        gfx.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0); }});
        gfx.setVisible(true);
        Toolkit.getDefaultToolkit().setDynamicLayout(false);
    }
}

 class Lab14avst extends Frame
{
    public void paint(Graphics g)
    {
        drawGrid(g);
        drawShapes(g);
    }

    public void drawGrid(Graphics g)
    {
        g.drawRect(10,10,800,600);
        g.drawLine(10,300,810,300);
        g.drawLine(410,10,410,610);
    }

    public void drawShapes(Graphics g){
        ArrayList<Shape> arr = new ArrayList<>();
        arr.add(new Shape1Square("Square", 40, 50, "A Square has 4 sides", 150, 290));
        arr.add(new Shape2Triangle("Triangle", 420, 50, "A Triangle has 3 sides", 510, 230));
        arr.add(new Shape3Octagon("Octagon", 40, 320, "A Octagon has 8 sides", 100,  570) );
        arr.add(new Shape4Circle("Circle", 420, 320, "A Circle has 0 sides", 550, 570));

        for(Shape s : arr)
        {
            s.drawShape(g);
            s.displayName(g);
            s.displayNumSides(g);
        }
    }
}

 abstract interface Shape
{
    public abstract void drawShape(Graphics g);

    public abstract void displayName(Graphics g);

    public abstract void displayNumSides(Graphics g);
}


class Shape1Square implements Shape
{
    String title;
    Point titleLocation;
    String desc;
    Point descLocation;

    public Shape1Square(String str, int x, int y, String desc, int x2, int y2) {
        this.title = str;
        titleLocation = new Point(x, y);
        this.desc = desc;
        this.descLocation = new Point(x2, y2);
    }

    public void drawShape(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(100, 60, 200, 200);
    }
    public  void displayName(Graphics g) {
        g.setColor(Color.black);
        g.drawString(title, titleLocation.x, titleLocation.y);
    }

    public void displayNumSides(Graphics g) {
        g.setColor(Color.black);
        g.drawString(desc, descLocation.x, descLocation.y);
    }
}

class Shape2Triangle implements Shape
{
    String title;
    Point titleLocation;
    String desc;
    Point descLocation;

    public Shape2Triangle(String str, int x, int y, String desc, int x2, int y2){
        this.title = str;
        titleLocation = new Point(x, y);
        this.desc = desc;
        this.descLocation = new Point(x2, y2);
    }
    public void drawShape(Graphics g)
    {
        g.setColor(Color.black);
        g.fillPolygon(new int[]{600, 500, 700}, new int[]{60, 200, 200}, 3);

    }
    public  void displayName(Graphics g) {
        g.setColor(Color.black);
        g.drawString(title, titleLocation.x, titleLocation.y);
    }
    public void displayNumSides(Graphics g) {
        g.setColor(Color.black);
        g.drawString(desc, descLocation.x, descLocation.y);
    }
}

class Shape3Octagon implements Shape
{
    String title;
    Point titleLocation;
    String desc;
    Point descLocation;

    public Shape3Octagon(String str, int x, int y, String desc, int x2, int y2) {
        this.title = str;
        titleLocation = new Point(x, y);
        this.desc = desc;
        this.descLocation = new Point(x2, y2);

    }
    public void drawShape(Graphics g)
    {
        g.setColor(Color.black);
        g.fillPolygon(new int[]{140, 220, 280, 280, 220, 140, 80, 80}, new int[]{360, 360, 420, 490, 550, 550, 490, 420 }, 8);
    }
    public  void displayName(Graphics g) {
        g.setColor(Color.black);
        g.drawString(title, titleLocation.x, titleLocation.y);
    }
    public void displayNumSides(Graphics g) {
        g.setColor(Color.black);
        g.drawString(desc, descLocation.x, descLocation.y);
    }
}

 class Shape4Circle implements Shape
{
    String title;
    Point titleLocation;
    String desc;
    Point descLocation;

    public Shape4Circle(String str, int x, int y, String desc, int x2, int y2) {
        this.title = str;
        titleLocation = new Point(x, y);
        this.desc = desc;
        this.descLocation = new Point(x2, y2);
    }
    public void drawShape(Graphics g)
    {
        g.setColor(Color.black);
        g.fillArc(500, 350, 200, 200, 0, 360);
    }
    public  void displayName(Graphics g) {
        g.setColor(Color.black);
        g.drawString(title, titleLocation.x, titleLocation.y);
    }
    public void displayNumSides(Graphics g) {
        g.setColor(Color.black);
        g.drawString(desc, descLocation.x, descLocation.y);
    }
}

