import java.awt.*;

class House extends Building {
    int width, height, _LOCATION;
    House(Graphics g, int width, int height, int numberOfMountains){
        super(g, width, height, numberOfMountains);
        this.width = width;
        this.height = height;

        this._LOCATION = width / (numberOfMountains)* (numberOfMountains-1) - (width / 20);

        this.drawFeatures(g);
        this.drawHouse(g);

    }
    private void drawHouse(Graphics g){
        g.setColor(new Color(165, 14, 14));
        int[] xPoints = new int[]{_LOCATION, _LOCATION + width / 10, ((_LOCATION  + _LOCATION + width / 10) / 2)};
        int[] yPoints = new int[]{((int)(0.25*width)), ((int)(0.25*width)), ((int)(0.2*width))};
        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }
    private void drawFeatures(Graphics g){
        new Chimney(g, width, height, _LOCATION);
        new Door(g, width, height, _LOCATION);
        new Window(g, width, height, _LOCATION);
    }
}