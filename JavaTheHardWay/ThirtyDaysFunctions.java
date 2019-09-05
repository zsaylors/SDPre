import java.util.Scanner;

/**
* Contains functions that make it easier to work with months.
*/
public class ThirtyDaysFunctions {
  public static void main( String[] args ) {
    Scanner kb = new Scanner(System.in);

    System.out.print( "Which month? (1-12) ");
    int month = kb.nextInt();

    System.out.println(monthDays(month) + "days hath " + monthName(month));
  }

/**
* Returns the name for the given month number (1-12).
*
* @author Graham Mitchell
* @param month the month number (1-12)
* @return      the English name of the month, or "error" if out of range.
*/
  public static String monthName( int month ) {
    String monthname = "error";

    if ( month == 1 )
      monthname = "January";
    else if ( month == 2 )
      monthname = "February";
    else if ( month == 3 )
      monthname = "March";
    else if ( month == 4 )
      monthname = "April";
    else if ( month == 5 )
      monthname = "May";
    else if ( month == 6 )
      monthname = "June";
    else if ( month == 7 )
      monthname = "July";
    else if ( month == 8 )
      monthname = "August";
    else if ( month == 9 )
      monthname = "September";
    else if ( month == 10 )
      monthname = "October";
    else if ( month == 11 )
      monthname = "November";
    else if ( month == 12 )
      monthname = "December";

    return monthname;
  }

  public static int monthDays( int month ) {
    int days;

    switch(month) {
      case 9:
      case 4:
      case 6:
      case 11: days = 30;
               break;
      case 2:  days = 28;
               break;
      default: days = 31;
    }
    return days;
  }
}
