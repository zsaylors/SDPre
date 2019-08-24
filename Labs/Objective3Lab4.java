import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    String firstName;
    String lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.println("What is your first name? ");
    firstName = input.next();  //Take in the users first name and stores it in the firstName variable.

    System.out.println("What is your last name? ");
    lastName = input.next();  //Take in the users first name and stores it in the lastName variable.

    System.out.println("How old are you? ");
    age = input.nextInt(); //Take in the users age name and stores it in the age variable.

    System.out.println("First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age);

    input.close();
  }
}
