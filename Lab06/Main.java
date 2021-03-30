// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;


 class GfxLabA extends Frame
{

    public void paint(Graphics g)
    {
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);
        int width = 770, height = 570, offset = 10;
        for(int i = 0, dia = RandomNumber(200); i < 100; i++, g.setColor(randomColor()), dia = RandomNumber(200)) {
            g.drawLine(RandomNumber(width / 2) + offset, RandomNumber(height / 2) + offset, RandomNumber(width / 2) + offset, RandomNumber(height / 2) + offset);
            g.fillRect(RandomNumber(width / 2-50)+offset*2 + width / 2, RandomNumber(height / 2 - 50) + offset, 50, 50 );
            g.drawOval(RandomNumber(width / 2-dia)+offset, RandomNumber(height / 2 - dia) + offset*2+height/2, dia, dia );
        }
        int[][] xPoints = new int[][]{{600, 700, 700, 600},{550,600, 600, 550}, {700, 650, 650}, {550, 650, 650, 600} }, yPoints = new int[][]{{400, 400, 500, 500}, {350, 400, 500, 450},{400, 400, 350},{350, 350, 400, 400} };
        Color [] colors = new Color[]{Color.red, Color.green, Color.blue, Color.yellow};
        g.setColor(colors[0]);
        for(int i = 0; i < xPoints.length; i++, g.setColor(i > xPoints.length-1 ? colors[0] : colors[i] )) g.fillPolygon(xPoints[i], yPoints[i], xPoints[i].length);
    }
    private Color randomColor(){
        return new Color((int)(Math.random() * 0x1000000));
    }
    private int RandomNumber(int max){
        return (int)(Math.random() * max)+1;
    }


}
public class Main {
    public static void main(String[] args) {
        GfxLabA gfx = new GfxLabA();
        gfx.setSize(980, 630);
        gfx.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0); }});
        gfx.setVisible(true);
        Toolkit.getDefaultToolkit().setDynamicLayout(false);
    }
}



    
 