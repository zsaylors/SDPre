import java.util.Scanner;

public class WeaselOrNot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println( "Type the word \"weasel\", please." );
    word = keyboard.next();

    //yep = word.equals("weasel");
    yep = "weasel".equals(word); // Study Drill.  It works.
    nope = ! word.equals("weasel");

    System.out.println( "You typed what was requested: " + yep );
    System.out.println( "You ignored polite instructions: " + nope );
  }
}
