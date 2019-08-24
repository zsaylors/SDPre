import java.util.Scanner;

public class Objective3Lab5 { //Create a class structure with the name Objective3Lab5.
  public static void main(String[] args) { //Create a main method.

    Scanner input = new Scanner(System.in); //Create a scanner.
    double num1, num2, sum;  //Take in two numbers and store them into variables.  Hint Use input.nextDouble() to have decimal precision.

    System.out.println("Please enter a number:");
    num1 = input.nextDouble();

    System.out.println("Please enter another number:");
    num2 = input.nextDouble();

    sum = num1 + num2;

    System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);
  }
}
