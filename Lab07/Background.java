import java.awt.*;

public class Background {
    final static int _WIDTH = 840, _HEIGHT = 490;
    final static int _RIVER_ROTATE_DISTANCE = 100, _RIVER_SEG_DISTANCE = 1, _SUN_RADIUS = 200;

    public static void drawSky(Graphics g){
        g.setColor(new Color(128, 128, 255));
        g.fillRect(0, 0, _WIDTH, _HEIGHT * 7 / 10 );

    }
    public static void drawSun(Graphics g){
        g.setColor(new Color(255, 221, 10, 250));
        g.fillArc(_WIDTH - _SUN_RADIUS / 2,  -(_SUN_RADIUS / 2), _SUN_RADIUS,_SUN_RADIUS,-90,-90);
    }
    public static void drawRiver(Graphics g) {
        g.setColor(new Color(0, 183, 255, 255));
        for (int i = 0; i < _WIDTH; i += _RIVER_SEG_DISTANCE) {
            int changeDistance =(int)( 0.12 * Math.abs( _RIVER_ROTATE_DISTANCE / 2 - i % _RIVER_ROTATE_DISTANCE));
            if ((int) (Math.round((double) (i) / _RIVER_ROTATE_DISTANCE)) % 2 != 0)
                g.drawLine(i, (int) (0.8 * _HEIGHT) + changeDistance, i, (int) (0.90 * _HEIGHT)+(changeDistance));
            else
                g.drawLine(i, (int) (0.8 * _HEIGHT) - changeDistance , i, (int) (0.90 * _HEIGHT)- changeDistance);
        }
    }
    public static void drawGrass(Graphics g){
        g.setColor(new Color(26, 59, 4, 255));
        g.fillRect(0, ((int)(0.7 * _HEIGHT)), _WIDTH, ((int)(0.4*_HEIGHT)) );
    }
}
