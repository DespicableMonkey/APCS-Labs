import java.util.ArrayList;

public class MovieGoer {
    private String name;
    private String movieWatched;
    private String seat;
    private int age;

    public MovieGoer(String n, String movieWatched, String s, int a) {
        this.name = n;
        this.movieWatched = movieWatched;
        this.seat = s;
        this.age = a;
    }

    public String getName(){ return this.name; }
    public String getMovieWatched(){ return this.movieWatched;}
    public String getSeat(){ return this.seat;}
    public int getAge(){ return this.age; }

    public String toString() {
        return "MovieGoer: "+this.name + " | info: [Movie Watched: "+this.movieWatched + ", Seat: "+this.seat + ", Age: " + this.age + "]";
    }

}