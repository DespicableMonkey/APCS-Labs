public class Main {
    public static void main(String[] args) {
        int startSeconds = 10000;
        System.out.println("80 Point"+"\n");
        System.out.printf("%s %6d %n", "Starting seconds: ",startSeconds);
        System.out.printf("%s %13d %n", "Hours: ", startSeconds / 3600);
        int remSeconds = startSeconds % 3600 ;
        System.out.printf("%s %12d %n", "Minutes: ", remSeconds / 60 );
        System.out.printf("%s %12d %n", "Seconds: ", remSeconds % 60);
        System.out.println(startSeconds +" seconds equals "+(startSeconds / 3600) +" hours, "+ (remSeconds / 60)+" minutes, "+(remSeconds % 60)+" seconds.");

        int startMilliseconds = 10000123;
        System.out.println("\n"+"100 Point"+"\n");
        System.out.printf("%s %6d %n", "Starting Milliseconds: ",startMilliseconds);
        System.out.printf("%s %17d %n", "Hours: ", startMilliseconds / 3600000);
        int remMilliSeconds = startMilliseconds % 3600000;
        System.out.printf("%s %16d %n", "Minutes: ", remMilliSeconds / 60000 );
        System.out.printf("%s %16d %n", "Seconds: ", remMilliSeconds % 60000 / 1000 );
        System.out.printf("%s %12d %n", "Milliseconds: ", remMilliSeconds % 1000);
        System.out.println(startMilliseconds + " milliseconds equals "+(startMilliseconds / 3600000) + " hours, "+ (remMilliSeconds / 60000) + " minutes, "+(remMilliSeconds % 60000 / 1000 )+" seconds, "+ (remMilliSeconds % 1000)+" milliseconds.");


    }
}
