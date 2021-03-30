import java.awt.*;

class Chimney {

    Chimney(Graphics g, int width, int height, int location){
        g.setColor(Color.black);
        g.fillRect(location + location / 50, ((int)(0.20 * width)), width / 50, height / 13);
    }
}