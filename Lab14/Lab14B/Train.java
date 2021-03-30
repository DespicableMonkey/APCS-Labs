import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;


class Train {
    ArrayList<RailCar> railcars  = new ArrayList<>();
    Point lastPoint = new Point();
    public Train(int x, int y) {
        this.lastPoint.x = x+175;
        this.lastPoint.y = y;
    }
    public void showCars(Graphics g){

        for(RailCar c : railcars){
            c.drawCar(g);
        }
    }
    public void addCar(String type, Color c) {
        if(type.equalsIgnoreCase("locomotive"))
            railcars.add(new Locomotive(c, this.lastPoint.x, this.lastPoint.y));
        else if(type.equalsIgnoreCase("PassengerCar"))
            railcars.add(new PassengerCar(c, this.lastPoint.x, this.lastPoint.y));
        else if(type.equalsIgnoreCase("FreightCar"))
            railcars.add(new FreightCar(c, this.lastPoint.x, this.lastPoint.y));
        else if(type.equalsIgnoreCase("Caboose"))
            railcars.add(new Caboose(c, this.lastPoint.x, this.lastPoint.y));

        this.lastPoint.x += 175;
    }
    public void addCar(int index, String type, Color c){
        int xCord = this.lastPoint.x - (this.railcars.size()-index) * 175;
        if(type.equalsIgnoreCase("locomotive"))
            railcars.add(index, new Locomotive(c, xCord, this.lastPoint.y));
        else if(type.equalsIgnoreCase("PassengerCar"))
            railcars.add(index, new PassengerCar(c, xCord, this.lastPoint.y));
        else if(type.equalsIgnoreCase("FreightCar"))
            railcars.add(index, new FreightCar(c, xCord, this.lastPoint.y));
        else if(type.equalsIgnoreCase("Caboose"))
            railcars.add(index, new Caboose(c, xCord, this.lastPoint.y));

        this.lastPoint.x += 175;
        for(int i = index+1; i < railcars.size(); ++i) {
            railcars.get(i).addXPos(175);
        }
    }

}