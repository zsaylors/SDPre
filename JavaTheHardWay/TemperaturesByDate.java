import java.util.Scanner;

class TemperatureSample {
  int month, day, year;
  double temperature;
}

public class TemperaturesByDate {
  public static void main(String[] args) throws Exception {
    String site = "http://academic.udayton.edu";
    String path = "/kissock/http/Weather/gsod95-current/CODENVER.txt";
    Scanner inFile = new Scanner((new java.net.URL(site+path)).openStream());

    TemperatureSample[] tempDB = new TemperatureSample[10000];

    int numRecords, i = 0;

    while ( inFile.hasNextInt() && i < tempDB.length ) {
      TemperatureSample e = new TemperatureSample();
      e.month = inFile.nextInt();
      e.day = inFile.nextInt();
      e.year = inFile.nextInt();
      e.temperature = inFile.nextDouble();
        if (e.temperature == -99 )
          continue;
      tempDB[i] = e;
      i++;
    }
    inFile.close();
    numRecords = i;

    System.out.println(numRecords + " daily temperatures loaded.");

    double total = 0, avg;
    int count = 0;
    for (i=0; i<numRecords; i++) {
      if (tempDB[i].month == 11) {
        total += tempDB[i].temperature;
        count++;
      }
    }

    double lowest = 0;
    for (i=0; i<numRecords; i++) {
        if (tempDB[i].month == 2) {
          if (tempDB[i].temperature < lowest) {
            lowest = tempDB[i].temperature;
          }
        }
      }

    avg = total / count;
    avg = roundToOneDecimal(avg);
    System.out.print("Average daily temperature over " + count);
    System.out.println(" days in November: " + avg);

    System.out.println("\nLowest daily temperature recorded in February in Denver was " + lowest);

    //TemperatureSample ts = tempDB[0];
    //System.out.println( ts );
  }

  public static double roundToOneDecimal(double d) {
    return Math.round(d*10)/10.0;
  }
}
