import java.awt.*;

class Background {

    int width, height;

    Background(Graphics g, int width, int height){
        this.width = width;
        this.height = height;

        this.drawSky(g);
        this.drawGrass(g);

        new River(g, width, height);
        new Sun(g, width, height);
    }
    public void drawSky(Graphics g){
        g.setColor(new Color(128, 128, 255));
        g.fillRect(0, 0, width, height * 7 / 10 );

    }

    public void drawGrass(Graphics g){
        g.setColor(new Color(26, 59, 4, 255));
        g.fillRect(0, ((int)(0.7 * height)), width, ((int)(0.4*height)) );
    }

}