import java.util.Scanner;

public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    age = input.nextInt(); //Take in the users age using input.nextInt() and store it in the age variable.
    birthYear = 2019 - age;  //Calculates what year the user was born in.  -- needs calander input to be completely accurate.

    System.out.println("You were born in " + birthYear); //Prints out the calculated birthYear.
    input.close();
  }
}
