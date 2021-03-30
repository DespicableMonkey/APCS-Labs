import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
class GfxApp extends Frame {
    public void paint(Graphics g) {
        Background.drawSky(g);
        Background.drawGrass(g);
        Background.drawRiver(g);
        Background.drawSun(g);

        House.drawFrame(g);
        House.drawTop(g);
        House.drawFeatures(g);

        Mountains.drawMountainBases(g);
        Mountains.drawMountainMids(g);
        Mountains.drawMountainTips(g);

    }
}
public class Main {
    public static void main(String[] args) {
        GfxApp gfx = new GfxApp();
        gfx.setSize(840, 490);
        gfx.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0); }});
        gfx.setVisible(true);
    }
}
