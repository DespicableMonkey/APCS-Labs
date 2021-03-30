import java.util.ArrayList;

class Employees<E> extends CommonMovieTheatre<E> {
    private ArrayList<E> people;

    Employees(){
        this.people = new ArrayList<E>();
    }

    public void addMovieGoers(E[] g){
        for(E mg : g)
            this.people.add(mg);
    }
    public void removeMovieGoer(E g){
        System.out.println("\nAn Employee Has finished the movie and left\n");
        this.people.remove(g);
    }

    public void parking(E g) {
        System.out.println("Allow parking in EMployee Loy");
    }
    public void checkTicket(E g) {
        System.out.println("Verify Both ticket and Employee Card");
    }
    public void buyTicket(E g) {
        System.out.println("Buy movie ticket with employee discount");
    }
    public void buySnack(E g) {
        System.out.println("Buy Snack with Employee Discount");

    }
    public String toString() {
        String civString = "Employees in the movie Theatre: ";
        for(E g : people)
            civString += "\n" + g ;
        return civString;
    }
}
