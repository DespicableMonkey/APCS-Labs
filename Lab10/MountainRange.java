import java.awt.*;

class MountainRange {
    int width, height, numberOfMountains;
    public MountainRange(Graphics g, int width, int height, int count){
        this.width = width;
        this.height = height;

        this.numberOfMountains = count;

        this.drawMountains(g);
    }

    public void drawMountains(Graphics g){
        final int cutB =  ((int)(width * 0.07)),
                cutC = ((int)(width * 0.09)),
                cutT = ((int)(width * 0.125));
        new SnowCappedMountain(g,width,height,cutB, cutC, cutT, numberOfMountains);
    }
}