import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Lab14bv100 gfx = new Lab14bv100();
        gfx.setSize(1200, 630);
        gfx.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0); }});
        gfx.setVisible(true);
        Toolkit.getDefaultToolkit().setDynamicLayout(false);
    }
}
class Lab14bv100 extends Frame
{
    public void paint(Graphics g)
    {
        Train train = new Train(100,300);
        train.addCar("Locomotive",Color.blue);
        train.addCar("PassengerCar",Color.gray);
        train.addCar("PassengerCar",Color.gray);
        train.addCar("FreightCar",Color.green);
        train.addCar(3,"PassengerCar",Color.gray);
        train.addCar("FreightCar",Color.green);
        train.addCar("Caboose",Color.red);
        train.addCar(6,"FreightCar",Color.green);
        train.showCars(g);
    }
}


