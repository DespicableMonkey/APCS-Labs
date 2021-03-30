import java.awt.*;

public class Mountains {
    final static int _WIDTH = 840, _HEIGHT = 490;

    final static int _NUMBER_OF_MOUNTAINS = 4, _CUT_BASE =  ((int)(_WIDTH * 0.07)), _CUT_CENTER = ((int)(_WIDTH * 0.09)),_CUT_TIP = ((int)(_WIDTH * 0.125));

    public static void drawMountainBases(Graphics g){
        g.setColor(new Color(50, 23, 23, 255));
        int base_height = ((int)((0.7)*_HEIGHT));
        int base_height_extended = -((int)(0.4*base_height));
        for(int i = 0; i < _NUMBER_OF_MOUNTAINS; ++i){
            int width_change = (_WIDTH / _NUMBER_OF_MOUNTAINS) * i;
            int upperWidth = width_change + ((_WIDTH) / _NUMBER_OF_MOUNTAINS);

            int xPoints [] = new int[]{width_change, upperWidth, upperWidth-_CUT_BASE, width_change+_CUT_BASE};
            int yPoints [] = new int[]{base_height, base_height, base_height + base_height_extended, base_height + base_height_extended};
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        }
    }
    public static void drawMountainMids(Graphics g){
        g.setColor(new Color(66, 29, 29, 255));
        int base_height = ((int)((0.422)*_HEIGHT));
        int base_height_extended = -((int)(0.2*base_height));

        for(int i = 0; i < _NUMBER_OF_MOUNTAINS; ++i){
            int width_change = ((int) (_WIDTH / _NUMBER_OF_MOUNTAINS) * i);
            int upperWidth = width_change + ((_WIDTH) / _NUMBER_OF_MOUNTAINS);

            int xPoints [] = new int[]{width_change+_CUT_BASE, upperWidth-_CUT_BASE, upperWidth-_CUT_CENTER, width_change+_CUT_CENTER};
            int yPoints [] = new int[]{base_height, base_height, base_height + base_height_extended, base_height + base_height_extended};
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        }
    }
    public static void drawMountainTips(Graphics g){
        g.setColor(new Color(255, 255, 255, 255));

        int base_height = ((int)((0.338)*_HEIGHT));
        int base_height_extended = -((int)(0.2*base_height));

        for(int i = 0; i < _NUMBER_OF_MOUNTAINS; ++i){
            int width_change = ((_WIDTH / _NUMBER_OF_MOUNTAINS) * i);
            int upperWidth = width_change + ((_WIDTH) / _NUMBER_OF_MOUNTAINS);

            int xPoints [] = new int[]{width_change+_CUT_CENTER, upperWidth-_CUT_CENTER, upperWidth-_CUT_TIP, width_change+_CUT_TIP};
            int yPoints [] = new int[]{base_height, base_height, base_height + base_height_extended, base_height + base_height_extended};
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        }
    }
}
