import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
  public static void main( String[] args ) throws Exception {
    PrintWriter fileout = new PrintWriter("receipt.txt");
    Scanner gal = new Scanner(System.in);
    Double gallons, price = 2.55, total = 0.0, gal1;

    //  Study exercise
    System.out.print("How many gallons do you want? ");
    gallons = gal.nextDouble();
    total = price * gallons;


    fileout.println( "+------------------------+" );
    fileout.println( "|" );
    fileout.println( "|      Corner Store" );
    fileout.println( "|" );
    fileout.println( "|  2019-08-22  11:01PM" );
    fileout.println( "|" );
    fileout.println( "|  Gallons:       " + gallons);
    fileout.println( "|  Price/gallon: $ " + price);
    fileout.println( "|" );
    fileout.println( "|  Fuel Total:  $ " + total);
    fileout.println( "|" );
    fileout.println( "+------------------------+" );
    fileout.close();
  }
}
