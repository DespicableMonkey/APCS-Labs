 import java.util.ArrayList;
 
 class Civilians<E> extends CommonMovieTheatre<E> {

    private ArrayList<E> people;

    Civilians(){
        this.people = new ArrayList<E>();
    }
     public void addMovieGoers(E[] g){
         for(E mg : g)
             this.people.add(mg);
     }
     public void removeMovieGoer(E g){
         System.out.println("\nA Civilian Has finished the movie and left\n");
         this.people.remove(g);
     }

     public void parking(E g) {
         System.out.println("Civillian can park in the regular lot");
     }
     public void checkTicket(E g) {
         System.out.println("Check Civilian ticket");
     }
     public void buyTicket(E g) {
         System.out.println("Buy ticket with regular pricing");
     }
     public void buySnack(E g) {
         System.out.println("Buy Snack with regular pricign");
     }
     public String toString() {
        String civString = "Civilians in the movie Theatre: ";
        for(E g : people)
            civString += "\n" + g ;
         return civString;
     }
 }