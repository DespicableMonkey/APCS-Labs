import java.awt.*;

class River {
    final int _RIVER_ROTATE_DISTANCE = 100, _RIVER_SEG_DISTANCE = 1;
    int width, height;
    River(Graphics g, int width, int height){
        this.width = width;
        this.height = height;

        this.drawRiver(g);
    }
    public void drawRiver(Graphics g) {
        g.setColor(new Color(0, 183, 255, 255));
        for (int i = 0; i < width; i += _RIVER_SEG_DISTANCE) {
            int changeDistance =(int)( 0.12 * Math.abs( _RIVER_ROTATE_DISTANCE / 2 - i % _RIVER_ROTATE_DISTANCE));
            if ((int) (Math.round((double) (i) / _RIVER_ROTATE_DISTANCE)) % 2 != 0)
                g.drawLine(i, (int) (0.8 * height) + changeDistance, i, (int) (0.90 * height)+(changeDistance));
            else
                g.drawLine(i, (int) (0.8 * height) - changeDistance , i, (int) (0.90 * height)- changeDistance);
        }
    }
}