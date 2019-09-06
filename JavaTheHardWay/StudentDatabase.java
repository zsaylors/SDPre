class Student {
  String name;
  int credits;
  double gpa;
}

public class StudentDatabase {
  public static void main( String[] args ) {
    Student[] db;
    db = new Student[4];

    db[0] = new Student();
    db[0].name = "Esteban";
    db[0].credits = 43;
    db[0].gpa = 2.9;

    db[1] = new Student();
    db[1].name = "Dave";
    db[1].credits = 15;
    db[1].gpa = 4.0;

    db[2] = new Student();
    db[2].name = "Michelle";
    db[2].credits = 132;
    db[2].gpa = 3.72;

    db[3] = new Student();
    db[3].name = "Strider";
    db[3].credits = 60;
    db[3].gpa = 4.01;

    for (int i=0; i < db.length; i++) {
      System.out.println("Name: " + db[i].name);
      System.out.println("\tCredit hours: " + db[i].credits);
      System.out.println("\tGPA: " + db[i].gpa);
    }

    int maxLoc = 0;

    for (int i=1; i < db.length; i++ )
      if (db[i].gpa > db[maxLoc].gpa )
        maxLoc = i;
    System.out.println(db[maxLoc].name + " has the highest GPA.");

    //Study Drill
    for (int i=1; i < db.length; i++)
      if (db[i].credits < db[maxLoc].credits)
        maxLoc = i;
    System.out.println(db[maxLoc].name + " has the fewest credits.");

  }
}
