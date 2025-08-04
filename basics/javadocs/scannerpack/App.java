package scannerpack;

import java.text.MessageFormat;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = userInput.nextLine();
    userInput.close();
    
    String msg = MessageFormat.format("Hi, {0}", name);
    System.out.println(msg);
  }
}
