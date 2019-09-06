public class ArrayIntro {
  public static void main(String[] args) {
    String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
    String[] array2 = { "1", "2", "3", "4" };// Study Drill


    for (String p : planets ) {
      System.out.println( p + "\t" + p.toUpperCase());
    }

    for (String a : array2 ) {
      System.out.println( a );
    }
  }
}
