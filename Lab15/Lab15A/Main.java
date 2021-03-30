// Lab15avst.java
// 02-28-15 by Leon Schram
// The "Odd Magic Square" Program
// This is the student, starting version of the Lab15 assignment.


import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the odd# size of the Magic Square -->  ");
        int size = input.nextInt();
        MagicSquare magic = new MagicSquare(size);

        magic.computeMagicSquare();
        magic.displayMagicSquare();
        	magic.checkRows();          // for 100 & 110 Point Version Only
        	magic.checkColumns();		 // for 100 & 110 Point Version Only
        	magic.checkDiagonals();	 	 // for 100 & 110 Point Version Only
    }
}


class MagicSquare
{
    private int size;
    private int magic[][];
    private DecimalFormat output;

    public MagicSquare(int s)
    {
        size = s;
        magic = new int[size][size];
        output = new DecimalFormat("000");
    }

    public void computeMagicSquare()
    {
        for(int i = 0, j = (size/2), num = 1; !(num == size*size+1); num++, --i, ++j, j = j%size, i = (i < 0) ? size-1 : i ) {
            magic[i][j] = num;
            if((num) % size == 0 ) {
                i += 2;
                --j;
            }
        }
    }

    public void displayMagicSquare()
    {
        System.out.println();
        System.out.println(size + "x" + size + " Magic Square");
        System.out.println("==================");
        System.out.println();

        for(int i = 0; i < size; ++i) {
            for(int k = 0; k < size; ++k) 
                System.out.print(String.format("%03d", magic[i][k]) + " ");
            System.out.print("\n");
        }
    }

    public void checkRows()
    {
        System.out.println();
        System.out.println("Checking Rows");
        System.out.println("=============");
        System.out.println();

        for(int i = 0; i < size; ++i) {
            int sum = 0;
            for (int k = 0; k < size; ++k) 
                sum += magic[i][k];
            System.out.print(sum + " ");
        }
    }

    public void checkColumns()
    {
        System.out.println();
        System.out.println("Checking Columns");
        System.out.println("================");
        System.out.println();

        for(int i = 0; i < size; ++i) {
            int sum = 0;
            for(int k = 0; k < size; ++k) 
                sum += magic[k][i];
            System.out.print(sum+" ");
        }
    }

    public void checkDiagonals()
    {
        System.out.println();
        System.out.println("Checking Diagonals");
        System.out.println("==================");
        System.out.println();
        for(int i = 0; i < 2; ++i) {
            int sum = 0;
            for(int k = 0; k < size; ++k){
                int index = (i ==0) ? k : (size-k-i);
                sum += magic[index][index];
            }
            System.out.print(sum + " ");
        }
        System.out.println("\n");
    }

}

