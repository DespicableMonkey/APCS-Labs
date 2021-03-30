public class Main {
    public static void main(String[] args) {
        System.out.println("Lab04a, Student Version"+"\n");

        //Values
        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;

        //Round principal
        String roundedPrincipal = String.format("$"+"%.2f", principal);
        //combined Annual Rate
        String annualRateAppended  = String.format("%.2f", annualRate) +"%"+"\n";

        //Print Base Values
        System.out.printf("Principal:%26s%n", roundedPrincipal);
        System.out.printf("Annual Rate: %19s",annualRateAppended);
        System.out.printf("Number of Years:%14.1f%n",numYears);

        //convert to monthly
        numYears *= 12;
        annualRate /= 100;
        annualRate /= 12;

        //Use Interest Formula
        double payment = (  annualRate * Math.pow((annualRate+1), numYears)) / (Math.pow((1+annualRate),numYears)-1) * principal;

        //Round to 2 decimal places without format, so I can use in math in below print statements
        payment = Math.round(payment*100);
        payment /= 100;

        //Print calculations
        System.out.printf("Monthly Payment: %17s%n",String.format("$"+"%.2f", payment));
        System.out.printf("Total Payment: %21s%n"  ,String.format("$"+"%.2f", (payment*numYears)));
        System.out.printf("Total Interest: %20s%n" ,String.format("$"+"%.2f", (payment*numYears) - principal));

    }
}
