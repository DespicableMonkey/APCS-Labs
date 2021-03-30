import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean notFinished = false;
        do{
            System.out.print("Enter a string  ===>>  ");
            String str = input.nextLine();
            System.out.println();
            System.out.println("Entered String      " + str);
            System.out.println("Palindrome:         " + Palindrome.isPal(str));
            System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));
            System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
            String repeat = input.nextLine();
            notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
            System.out.println();
        } while (notFinished);

    }
}

class Palindrome {
    public static boolean isPal(String s) {
        s = s.toUpperCase();
        for (int i = 0; i < s.length() / 2; ++i) if(i != s.length() / 2 && !s.substring(i, i+1).equals(s.substring(s.length() - i - 1, s.length() - i)))return false;
        return true;
    }
    private static String purge(String s) {
       String purgedString = "";
       for(int i = 0; i < s.length(); ++i) purgedString += (isLetter(s.substring(i, i + 1))) ? s.substring(i, i+1) : "";
       return purgedString;
    }
    public static boolean isLetter(String letter) { return (letter.matches("[a-zA-Z]")); }
	public static boolean almostPal(String s) { return !isPal(s) && isPal(purge(s));}
}