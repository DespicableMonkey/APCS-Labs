import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MovieGoer vipsList[] = new MovieGoer[]{new MovieGoer("Rachel Jewels", "Harry Potter", "A14", 26),
                new MovieGoer("Jackson Lewis", "King Kong", "F12", 26),
                new MovieGoer("The Rock", "Skyscraper", "A1", 42),
                new MovieGoer("Pulkith Paruchuri", "The movie of Movies", "Z0", 16)};
        VIPs<MovieGoer> vips = new VIPs<>();
        vips.addMovieGoers(vipsList);

        System.out.println(vips);

        vips.removeMovieGoer(vipsList[2]);
		
        System.out.println(vips);


    }
}