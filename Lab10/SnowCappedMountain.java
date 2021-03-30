import java.awt.*;

class SnowCappedMountain extends HighAltitudeMountain {
    int width, height;

    SnowCappedMountain(Graphics g, int width, int height, int cutB, int cutC, int cutT, int numberOfMountains){
        super(g, width, height, cutB, cutC, cutT, numberOfMountains);
        this.width = width;
        this.height = height;

        this.drawMountainTips(g);

    }
    public void drawMountainTips(Graphics g){
        g.setColor(new Color(255, 255, 255, 255));

        int baseheight = ((int)((0.338)*height));
        int baseheight_extended = -((int)(0.2*baseheight));

        for(int i = 0; i < _NUMBER_OF_MOUNTAINS; ++i){
            int width_change = ((width / _NUMBER_OF_MOUNTAINS) * i);
            int upperWidth = width_change + ((width) / _NUMBER_OF_MOUNTAINS);

            int[] xPoints = new int[]{width_change+_CUT_CENTER, upperWidth-_CUT_CENTER, upperWidth-_CUT_TIP, width_change+_CUT_TIP};
            int[] yPoints = new int[]{baseheight, baseheight, baseheight + baseheight_extended, baseheight + baseheight_extended};
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        }
    }

}