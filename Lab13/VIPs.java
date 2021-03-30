import java.util.ArrayList;

class VIPs<E> extends CommonMovieTheatre<E> {
    private ArrayList<E> people;

    VIPs(){
        this.people = new ArrayList<E>();
    }
    public void addMovieGoers(E[] g){
        for(E mg : g)
            this.people.add(mg);
    }
    public void removeMovieGoer(E g){
        System.out.println("\nA VIP Has finished the movie and left\n");
        this.people.remove(g);
    }
    public void parking(E g) {
        System.out.println("VIP can park in VIP or civillian lot");
    }
    public void checkTicket(E g) {
        System.out.println("Verify both ticket and VIP pass");
    }
    public void buyTicket(E g) {
        System.out.println("Buy movie ticket with VIP Discount");
    }
    public void buySnack(E g) {
        System.out.println("Buy snack with VIP Discount");
    }
    public String toString() {
        String civString = "VIPs in the movie Theatre: ";
        for(E g : people)
            civString += "\n" + g ;
        return civString;
    }
}