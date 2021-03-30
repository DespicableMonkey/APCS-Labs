import java.util.Scanner;

public class Main{
     static int num, den;

    public static void main(String[] args) {
        enterData();
        Rational r = new Rational(num, den);
        r.displayData();
    }

    public static void enterData(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = input.nextInt();
        System.out.print("\nEnter the denominator --> ");
        den = input.nextInt();
    }
}

class Rational{
    private int reducedNum, reducedDen, gcf, firstNum, firstDen;
    public Rational(int num, int den){
        this.firstNum = num;
        this.firstDen = den;
        getGCF(firstNum, firstDen);
        reduce();
    }
    public int getNum(){return this.reducedNum;}
    public int getDen(){return this.reducedDen;}
    public double getDecimal(){return (double)this.firstNum / this.firstDen;}
    public String getOrignal(){return this.firstNum+"/"+this.firstDen;}
    public String getReduced(){return reducedNum + "/" + reducedDen;}
    private void reduce(){
        this.reducedNum = this.firstNum / gcf;
        this.reducedDen = this.firstDen / gcf;
    }

    public void displayData(){
        System.out.println();
        System.out.println(getOrignal() + " equals " + getDecimal());
        System.out.println();
        System.out.println("and reduces to "+getReduced());
        System.out.println();
    }

    private void getGCF(int n1, int n2){
        int rem = 0;
        do{
            rem = n1 % n2;
            if(rem == 0)
                gcf = n2;
            else{
                n1 = n2;
                n2 = rem;
            }
        }
        while(rem != 0);
    }
}