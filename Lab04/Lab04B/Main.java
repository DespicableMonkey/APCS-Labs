import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class GfxApp extends Frame{
    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(100,100,200,200);
        g.drawRect(180,180,200,200);

        g.drawLine(100,100,180,180);
        g.drawLine(300,100,380,180);
        g.drawLine(100, 300, 180, 380);
        g.drawLine(300, 300, 380, 380); 

        // DRAW SPHERE
        //used vars so I could move the sphere into the cube
        Point sphereTopPole = new Point(140, 140);
        int ovalSize = 200;

        //main circle
        g.drawOval(sphereTopPole.x, sphereTopPole.y, ovalSize, 200);

        //longitude circles
        g.drawOval(sphereTopPole.x+ ((int)( (ovalSize - ovalSize*0.75) / 2)), sphereTopPole.y, ((int)(ovalSize*0.75)), ovalSize);
        g.drawOval(sphereTopPole.x+ ((int)( (ovalSize - ovalSize*0.5) / 2)), sphereTopPole.y, ((int)(ovalSize*0.5)), ovalSize);
        g.drawOval(sphereTopPole.x+ ((int)( (ovalSize - ovalSize*0.20) / 2)), sphereTopPole.y, ((int)(ovalSize*0.20)), ovalSize);
        //latitude circles
        g.drawOval( sphereTopPole.x,sphereTopPole.y+ ((int)( (ovalSize - ovalSize*0.75) / 2)),  ovalSize, ((int)(ovalSize*0.75)));
        g.drawOval( sphereTopPole.x,sphereTopPole.y+ ((int)( (ovalSize - ovalSize*0.5) / 2)),  ovalSize, ((int)(ovalSize*0.5)));
        g.drawOval( sphereTopPole.x,sphereTopPole.y+ ((int)( (ovalSize - ovalSize*0.20) / 2)),  ovalSize, ((int)(ovalSize*0.20)));

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        int offset = 100;
        g.drawOval(600,350, 200, 200);
        g.drawLine(600, 450, 600 + offset, 550);
        g.drawLine(600, 450, 675 + offset,385 );
        g.drawLine(700, 550, 675 + offset, 385);
        g.drawOval(638, 421, 94, 94);

        // DRAW APCS
            /* A */
        g.fillRect(100, 400, 20, 100);
        g.fillRect(100, 400, 40, 20);
        g.fillRect(140, 400, 20, 100);
        g.fillRect(100, 440, 40, 20);
            /* P */
        g.fillRect(180, 400, 20, 100);
        g.fillRect(180, 400, 40, 20);
        g.fillRect(220, 400, 20, 50);
        g.fillRect(180, 440, 60, 20);
            /* C */
        g.fillRect(260, 400, 20, 100);
        g.fillRect(260, 400, 60 , 20);
        g.fillRect(260, 480, 60 , 20);
            /* S */
        g.fillRect(340, 400, 60, 20);
        g.fillRect(340, 400, 20, 40);
        g.fillRect(340, 440, 60, 20);
        g.fillRect(380, 440, 20, 40);
        g.fillRect(340, 480, 60, 20 );

        // DRAW PACMEN FLOWER
        g.setColor(Color.black);
        g.fillArc(450,350,75,75,135,270);
        g.fillArc(500,400,75,75,45,270);
        g.fillArc(400,400,75,75,225,270);
        g.fillArc(450,450,75,75,315,270);
    }

}
public class Main {
    public static void main(String[] args) {
        GfxApp gfx = new GfxApp();
        gfx.setSize(900, 900);
        gfx.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0); }});
        gfx.setVisible(true);
    }
}
