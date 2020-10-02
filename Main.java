/**
 * while loop example
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // start counting message
    System.out.println("Starting to count");

    //make a counter variable
    int counter = 1;

    //make a loop that counts to 5
    while(counter <= 5){
      //print counter
      System.out.println(counter);
      //increase counter by 1
      counter = counter + 1;
    }
    
    //finished counting message
    System.out.println("Done counting");
  }
}
