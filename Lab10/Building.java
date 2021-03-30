import java.awt.*;

class Building {

    int width, height;
    Building (Graphics g, int width, int height, int numberIfMountains){
        this.width = width;
        this.height = height;

        this.drawBuildingBase(g, numberIfMountains);
    }

    private void drawBuildingBase(Graphics g, int numberOfMountains){

        final int _LOCATION = width / (numberOfMountains)* (numberOfMountains-1) - (width / 20);

        g.setColor(new Color(1,1,1));
        g.drawRect(_LOCATION, ((int)(0.25*width)), width / 10, height / 7);
        g.setColor(new Color(212, 162, 103));
        g.fillRect(_LOCATION+1, ((int)(0.25*width)), width / 10, height / 7);
    }
}