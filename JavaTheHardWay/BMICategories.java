import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double ft, in, lb, m, kg, bmi; // with study drill inputs


    //STUDY DRILL
    System.out.print( "Your height (feet only): ");
    ft = keyboard.nextDouble();
    System.out.print( "Your height (inches only): ");
    in = keyboard.nextDouble();
    System.out.print( "Your weight in pounds: ");
    lb = keyboard.nextDouble();

    kg = lb / 2.205;
    m = ((ft * 12) + in) * 0.0254;
    bmi = kg / (m*m);
    //END STRUDY DRILL ADDITION.

    //System.out.print( "Enter your BMI: " );
    //bmi = keyboard.nextDouble();

    System.out.print( "BMI category: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
    else if ( bmi < 40.0 ) {
      System.out.println( "severely obese" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }
  }
}
