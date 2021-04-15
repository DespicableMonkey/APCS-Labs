// Lab17bvst.java
// The student, starting version of the Lab17b assignment.


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lab17B {
    public static void main(String[] args) {
        Fractal gfx = new Fractal();
        gfx.setSize(1000, 650);
        gfx.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0); }});
        gfx.setVisible(true);
    }
}
 class Fractal extends Frame
{
    Graphics g;
    int maxX = 1000;
    int maxY = 650;
    double mX = 1000, mY = 650;

    public void paint (Graphics g)
    {
        int bitmask = Integer.parseInt("0111", 2);
        this.g = g;
        drawSquare1(g,this.maxX,this.maxY);
        this.drawMainPeripheralSquare();
        double initialX = (mX/2-mX/4), initialY = (mY/2-mY/4);
        this.recursivelyDrawSquares(1, initialX, initialY, bitmask);
    }

    public void drawSquare1(Graphics g, int maxX, int maxY)
    {
        int startWidth = maxX/4;
        int startHeight = maxY/4;
        g.fillRect(maxX/2 - (startWidth/2),maxY/2 - (startHeight/2),startWidth,startHeight);
    }
    public void drawMainPeripheralSquare() {
        int width = (int) (mX/8), height = (int)(mY/8);
        g.fillRect(maxX/2-width*2, maxY/2-height*2-1, width, height+1);
        g.fillRect(maxX/2+width, maxY/2-height*2, width, height);
        g.fillRect(maxX/2-width*2, maxY/2+height, width, height);
        g.fillRect(maxX/2+width, maxY/2+height, width, height);
    }
    public void recursivelyDrawSquares(int count, double xP, double yP, int bitmask){
        int     width = (int)(mX / Math.pow(2, 3+count)),
                height = (int)(mY / Math.pow(2, 3+count));
        if(count == 1){
            System.out.println(mX/2 - mX/4);
            System.out.println((int) (mX/2 -mX/4 ));
        }
        if(width < 2 || height < 2) return;
        xP -= width;
        yP -= height;
        g.fillRect((int)xP, (int)yP, width, height);
        g.fillRect((int)xP+width*3, (int)yP, width, height);
        g.fillRect((int)xP, (int)yP+height*3, width, height);
        bitmask>>=1;
        bitmask+=16;
        recursivelyDrawSquares(count+1, xP, yP, bitmask);
    }

    public void delay(long n)
    {
        n *= 1000;
        long startDelay = System.nanoTime();
        long endDelay = 0;
        while (endDelay - startDelay < n)
            endDelay = System.nanoTime();
    }

}

class system {


}


