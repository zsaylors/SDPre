import java.util.Scanner;

public class Objective4Lab4 {  //Create a class structure with the name Objective4Lab4.
  public static void main(String[] args) { //Create a main method.
    Scanner input = new Scanner(System.in); //Create a scanner.

    System.out.println("Please enter a number:");
    int num = input.nextInt();

    if (num % 2 == 0) {
      System.out.println("The number is even");
    }
    else {
      System.out.println("The number is odd");
    }
  }
}
