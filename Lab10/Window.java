import java.awt.*;

class Window {
    Window(Graphics g,int _WIDTH, int _HEIGHT, int _LOCATION){
        g.setColor(new Color(255, 255, 255));
        g.fillRect(_LOCATION + _LOCATION / 12, ((int)(0.27*_WIDTH)), _WIDTH / 40, _HEIGHT / 25 );
        g.setColor(new Color(1,1,1));
        g.drawRect(_LOCATION + _LOCATION / 25, ((int)(0.304*_WIDTH)), _WIDTH / 50, _HEIGHT / 20 );
        g.drawRect(_LOCATION + _LOCATION / 12, ((int)(0.27*_WIDTH)), _WIDTH / 40, _HEIGHT / 25 );
        g.drawLine(_LOCATION + _LOCATION / 12, (((int)(0.27*_WIDTH)) + ((int)(0.27*_WIDTH)) + _HEIGHT / 25)/2 ,_LOCATION + _LOCATION / 12 + _WIDTH / 40,(((int)(0.27*_WIDTH)) + ((int)(0.27*_WIDTH)) + _HEIGHT / 25)/2);
        g.drawLine(_LOCATION + _LOCATION / 12 + (_WIDTH / 40) / 2, ((int)(0.27*_WIDTH)),_LOCATION + _LOCATION / 12 + (_WIDTH / 40) / 2, ((int)(0.27*_WIDTH)) + _HEIGHT / 25);
    }

}