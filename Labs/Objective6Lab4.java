public class Objective6Lab4 { //Create a class structure with the name Objective6Lab4.
  public static void main(String[] args) { //Create a main method.
    int count = 0, sum = 0; //Create two variables to store the current sum total and a counter.

    while (count <= 20) {
      sum += count;
      count++;  //Increment the value of count with each iteration. + Use the count variable to have the loop execute 20 times.
    }
    System.out.println(sum);  // prints final sum.
  }
}
