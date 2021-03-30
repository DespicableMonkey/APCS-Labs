import java.awt.*;

class Sun {
    final int _SUN_RADIUS = 200;
    int width, height;
    Sun(Graphics g, int width, int height){
        this.width = width;
        this.height = height;

        this.drawSun(g);
    }

    public void drawSun(Graphics g){
        g.setColor(new Color(255, 221, 10, 250));
        g.fillArc(width - _SUN_RADIUS / 2,  -(_SUN_RADIUS / 2), _SUN_RADIUS,_SUN_RADIUS,-90,-90);
    }
}