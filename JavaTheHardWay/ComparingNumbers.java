import java.util.Scanner;

public class ComparingNumbers {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print( "Give me two numbers. First: ");
    first = keyboard.nextDouble();
    System.out.print( "Second: " );
    second = keyboard.nextDouble();

    if ( first < second )
      System.out.println( first + " is LESS THAN " + second );
    if ( first <= second )
      System.out.println( first + " is LESS THAN/EQUAL TO " + second );
    if ( first == second )
      System.out.println( first + " is EQUAL TO " + second );
    if ( first >= second )
      System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
    if ( first > second )
      System.out.println( first + " is GREATER THAN " + second );
    if ( first != second ) {
      System.out.println( first + " IS NOT EQUAL TO " + second );
    //Study Drill
      System.out.println( "Hey." ); //Hey runs no matter what (before second study drill)- it is external of the above if statement.
    }// added for second study drill.
  }
}
