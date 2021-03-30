import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound  ===>>  ");
        final int MAX = input.nextInt();
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }
    public static void computePrimes(boolean primes[]) {
       for(int i = 2; i < primes.length; ++i)
           for(int j = i*2; j < primes.length; j+=i)
               primes[j] = true;
    }
    public static void displayPrimes(boolean primes[]) {
        System.out.println("\nPRIMES BETWEEN 1 AND " + primes.length);
        DecimalFormat df = new DecimalFormat("0000");
        for(int i = 2, count = 0; i < primes.length; ++i){
            if(!primes[i] ) {
                System.out.print(df.format(i) + " ");
                ++count;
                if(count % 15 == 0)
                    System.out.println();
            }
        }
    }
}