import java.util.Scanner;

public class ShallowGrandmother {
  public static void main( String[] args ) {
    Scanner keyboard =  new Scanner(System.in);
    int age;
    double income, cute, happy;
    boolean allowed, allowed2;

    System.out.print( "Enter your age: " );
    age = keyboard.nextInt();

    System.out.print( "Enter your yearly income: " );
    income = keyboard.nextDouble();

    System.out.print( "How cure ate you, on a scale from 0.0 to 10.0? " );
    cute = keyboard.nextDouble();

    //Study drill input
    System.out.print( "How happy do you make them? " );
    happy = keyboard.nextDouble();

    allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );
    //Study drill expression
    allowed2 = ( happy >= 7  && age > 25 && age < 40);

    System.out.println( "Allowed to date my grandchild? " + allowed );

    //Study drill output
    System.out.println( "Allowed to date my grandchild? " + allowed2);
  }
}
