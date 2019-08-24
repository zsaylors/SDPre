import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, lastName;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello, what is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh?  That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "!  Better keep that quiet!!" );
    System.out.print("Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

    System.out.print( "What is your last name " + name + "? " );
    lastName = keyboard.next();
    System.out.println("That's nice.  Goodbye, " + name + " " + lastName );
  }
}

/*Study Drills
1. No.  An integer is double.  A double may not be an integer, though.
2. No.  an integer can be used in a string.
3. First question the program will convert to a string.  The second question a decimal or any non-number will blow up the program.  For the third and fourth question any non-number will blow up the program.
4. Asks last name.
*/
