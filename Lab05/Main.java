import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class GfxApp2 extends Frame {
    public void paint(Graphics g) {
        int intialH = 630;
        int initalW = 980;
        int width = 980;
        int height = 630;
        g.drawRect(10, 10, width, height);
        for(int k = 0, offsetWidth = 0, offsetHeight =0, adj = 2, mult=0; k < 5; k++, mult = (k > 0) ? 1 : 0){
            offsetWidth += width / 4 * mult;
            offsetHeight +=  height / 4 * mult;
            width = (k > 0) ? width / 2 : width;
            height = (k > 0) ? height / 2 : height;
            for(int i = (int)(10.0 * (1- mult)); i < width; i+=(10.0 / (k+1))) {
                g.drawLine(((int) width - i) + offsetWidth, height + offsetHeight + adj, (int) width + offsetWidth, ((int) (((double) height / width) * i)) + offsetHeight + adj);
                g.drawLine(i + offsetWidth, intialH - offsetHeight, offsetWidth, ((int) (((double) height / width) * i)) + offsetHeight);
                g.drawLine(i + offsetWidth, offsetHeight, offsetWidth, (height - (int) (((double) height / width) * i)) + offsetHeight);
                g.drawLine(((int) width - i) + offsetWidth, offsetHeight, initalW - offsetWidth, (height - (int) (((double) height / width) * i)) + offsetHeight);
            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        GfxApp2 gfx2 = new GfxApp2();
        gfx2.setSize(980, 630);
        gfx2.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0); }});
        gfx2.setVisible(true);
    }
}
