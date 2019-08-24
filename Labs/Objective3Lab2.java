import java.util.Scanner;

public class Objective3Lab2 {
  public static void main(String[] args) {
    String name = "";
    Scanner input = new Scanner(System.in);

    System.out.println("What's your name?");
    name = input.next(); //Take in the user's name and store it in the name variable.
    System.out.println("Hello " + name); //Print out "Hello ***" where *** is the value the user entered.

    input.close();
  }
}
