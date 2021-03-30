import java.awt.*;

class Door {
    public Door(Graphics g,int _WIDTH, int _HEIGHT, int _LOCATION ){
        g.setColor(new Color(36, 61, 191));
        g.fillRect(_LOCATION + _LOCATION / 25, ((int)(0.304*_WIDTH)), _WIDTH / 50, _HEIGHT / 20 );
    }

}