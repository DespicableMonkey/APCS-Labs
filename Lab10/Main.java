import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/*

Mountain Ranges has a:
Snow capped Mountain(means it has a white tip), which is a High Altitude Mountain(means it has a 'tip' at a higher elevation), which is a Mountain
House is a Building and has a window, chimney and door
Background has a sun and river

 */



public class Main {
    public static void main(String[] args) {
        GfxApp gfx = new GfxApp();
        gfx.setSize(840, 490);
        gfx.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        gfx.show();
    }
}
class GfxApp extends Frame {
    int width = 840, height = 490;

    public void paint(Graphics g) {
        new Background(g, width, height);
        int numberOfMountains = 4;
        new House(g, width, height,numberOfMountains);
        new MountainRange(g, width, height, numberOfMountains);

    }
}



