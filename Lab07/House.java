import java.awt.*;

public class House {
    final static int _WIDTH = 840, _HEIGHT = 490;

    final static int _LOCATION = Mountains._WIDTH / (Mountains._NUMBER_OF_MOUNTAINS)* (Mountains._NUMBER_OF_MOUNTAINS-1) - (Mountains._WIDTH / 20);

    public static void drawFrame(Graphics g){
        g.setColor(new Color(1,1,1));
        g.drawRect(_LOCATION, ((int)(0.25*_WIDTH)), _WIDTH / 10, _HEIGHT / 7);
        g.setColor(new Color(212, 162, 103));
        g.fillRect(_LOCATION+1, ((int)(0.25*_WIDTH)), _WIDTH / 10, _HEIGHT / 7);
    }
    public static void drawTop(Graphics g){
        g.setColor(new Color(165, 14, 14));
        int xPoints [] = new int[]{_LOCATION, _LOCATION + _WIDTH / 10, ((_LOCATION  + _LOCATION + _WIDTH / 10) / 2)};
        int yPoints [] = new int[]{((int)(0.25*_WIDTH)), ((int)(0.25*_WIDTH)), ((int)(0.2*_WIDTH))};
        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }
    public static void drawFeatures(Graphics g){
        g.setColor(new Color(36, 61, 191));
        g.fillRect(_LOCATION + _LOCATION / 25, ((int)(0.304*_WIDTH)), _WIDTH / 50, _HEIGHT / 20 );
        g.setColor(new Color(255, 255, 255));
        g.fillRect(_LOCATION + _LOCATION / 12, ((int)(0.27*_WIDTH)), _WIDTH / 40, _HEIGHT / 25 );
        g.setColor(new Color(1,1,1));
        g.drawRect(_LOCATION + _LOCATION / 25, ((int)(0.304*_WIDTH)), _WIDTH / 50, _HEIGHT / 20 );
        g.drawRect(_LOCATION + _LOCATION / 12, ((int)(0.27*_WIDTH)), _WIDTH / 40, _HEIGHT / 25 );
        g.drawLine(_LOCATION + _LOCATION / 12, (((int)(0.27*_WIDTH)) + ((int)(0.27*_WIDTH)) + _HEIGHT / 25)/2 ,_LOCATION + _LOCATION / 12 + _WIDTH / 40,(((int)(0.27*_WIDTH)) + ((int)(0.27*_WIDTH)) + _HEIGHT / 25)/2);
        g.drawLine(_LOCATION + _LOCATION / 12 + (_WIDTH / 40) / 2, ((int)(0.27*_WIDTH)),_LOCATION + _LOCATION / 12 + (_WIDTH / 40) / 2, ((int)(0.27*_WIDTH)) + _HEIGHT / 25);
    }
}
