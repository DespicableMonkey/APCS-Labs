public class Lab16 {
    public static void main(String[] args) {
        System.out.println(gcd(80, 120)); //gcd is 40
        System.out.println(stringReverse("Pulkith", 0)); //reverse is htikluP
        System.out.println(yearsToMinutes(1)); // number of minutes is 525600
    }

    public static int gcd(int a, int b) {
        if(b == 0)  return a;
        return gcd(b, a % b);
    }
    public static long yearsToMinutes(int years) {
        return (long)(years)*365*24*60;
    }
    public static String stringReverse(String str, int position) {
        if(position >= str.length()) return "";
        return (stringReverse(str, ++position)) + str.charAt(position-1);
    }
}
