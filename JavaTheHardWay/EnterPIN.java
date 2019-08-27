import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, entry2;

    pin = 12345;
    password = "abcde"; // study drill password

    System.out.println("WELCOME TO THE BANK OF JAVA.");

    //Study drill to enter password
    System.out.print("ENTER YOUR PASSWORD: ");
    entry2 = keyboard.next();

    while ( ! entry2.equals(password) ) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
      entry2 = keyboard.next();
    }
    //end of study drill

    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED.  YOUR ACCOUNT BALANCE IS $425.17");
  }
}
