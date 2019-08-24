import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double ft, in, lb, m, kg, bmi;

    System.out.print( "Your height (feet only): ");
    ft = keyboard.nextDouble();
    System.out.print( "Your height (inches only): ");
    in = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: ");
    lb = keyboard.nextDouble();

    kg = lb / 2.205;
    m = ((ft * 12) + in) * 0.0254;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
