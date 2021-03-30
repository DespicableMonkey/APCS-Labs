import java.awt.*;

class Mountain {
    int width, height;
    int _NUMBER_OF_MOUNTAINS, _CUT_BASE, _CUT_CENTER, _CUT_TIP;
    Mountain(Graphics g, int width, int height, int cutB, int cutC, int cutT, int numberOfMountains){
        this.width = width;
        this.height = height;

        this._CUT_BASE = cutB;
        this._CUT_CENTER = cutC;
        this._CUT_TIP = cutT;

        this._NUMBER_OF_MOUNTAINS = numberOfMountains;

        this.drawMountainBases(g);
    }

    public void drawMountainBases(Graphics g){
        g.setColor(new Color(50, 23, 23, 255));
        int baseheight = ((int)((0.7)*height));
        int baseheight_extended = -((int)(0.4*baseheight));
        for(int i = 0; i < _NUMBER_OF_MOUNTAINS; ++i){
            int width_change = (width / _NUMBER_OF_MOUNTAINS) * i;
            int upperWidth = width_change + ((width) / _NUMBER_OF_MOUNTAINS);

            int[] xPoints = new int[]{width_change, upperWidth, upperWidth-_CUT_BASE, width_change+_CUT_BASE};
            int[] yPoints = new int[]{baseheight, baseheight, baseheight + baseheight_extended, baseheight + baseheight_extended};
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        }
    }
}