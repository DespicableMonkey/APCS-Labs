abstract class CommonMovieTheatre<E> implements MovieTheatre<E> {
    public void information(E g){
        System.out.println("MovieGoer's Information: " + g);
    }
    public void emergency(E g){
        System.out.println("Direct movie goer towards the emergency exit");
    }
    public void useRestroom(E g) {
        System.out.println("Direct movie goer towards the restrooms");
    }
    public void seat(E g){
        System.out.printf("Direct movie goer towards their seat");
    }
    public void goToMovie(E g) {
        System.out.println("Direct movie goer to the right movie ");
    }
}