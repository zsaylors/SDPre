public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, day;
    double seconds, e, checking, gas;
    String firstName, lastName, title, month, year;

    x = 10;
    y = 400;
    age = 39;
    day = 23;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    gas = 2.55;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    month = "August";
    year = "2019";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds.");
    System.out.println( "A favorite irrational # is Euler's number: " + e);
    System.out.println( "Hopefully you have more than $" + checking + "!");
    System.out.println( "My name's " + title + " " + firstName + lastName);
    System.out.println( "It is " + month + " " + day + ", " + year + ", and gas is $" + gas);
  }
}
