import java.util.Scanner;

class Room {
  int roomNumber;
  String roomName;
  String description;
  int numExits;
  String[] exits = new String[10];
  int[] destinations = new int[10];
}

public class TextAdventureFinal {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    // initialize rooms from file.
    Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt");

    // showAllRooms(rooms); // for debugging

    // Okay, so let's play the game
    int currentRoom = 0;
    String ans;
    while (currentRoom >= 0) {
      Room cur = rooms[currentRoom];
      System.out.print( cur.description );
      System.out.print("> ");
      ans = keyboard.nextLine();

      // See what they typed matches any of our exit names;
      boolean found = false;
      for (int i = 0; i < cur.numExits; i++) {
        if (cur.exits[i].equals(ans)) {
          //if so, change our next room to that exit's room number
          currentRoom = cur.destinations[i];
          found = true;
        }
      }
      if (! found)
        System.out.prinln("Sorry, I don't understand.");
    }
  }

  public static Room[] loadRoomsFromFile( String filename ) {
    Scanner file = null;
    try {
      file = new Scanner(new java.io.File(filename));
    }
    catch (java.io.IOException e) {
      System.err.prontln("Can't open '" + filename + "' for reading.");
      System.exit(1);
    }

    in numRooms = file.nextInt();
    Room[] rooms = new Room[numRooms]

    //
  }
}
