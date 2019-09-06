import java.util.Scanner;

public class ArrayLinearSearch {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828 };
    int toFind;
    boolean found;

    System.out.print("There are " + orderNumbers.length);
    System.out.println(" order numbers in the database.");

    System.out.print("Orders: ");
    for (int num: orderNumbers) {
      System.out.print(num + " ");
    }
    System.out.println();


    System.out.print("Which order to find? ");
    toFind = keyboard.nextInt();


    //int arrayLength = orderNumbers.length;

    found = false;
    for (int num: orderNumbers) {
      if (num == toFind) {
        System.out.println( num + " found.");
        found = true;
      }
    }

    if ( found == false ) {
      System.out.println( toFind + " not found.");
    }
  }
}
