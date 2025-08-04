package simple;
public class MainApp {
  public static Adder adder = new Adder();
  public static Honda honda = new Honda();
  
  public static void main(String[] args) {
    System.out.println("Starting MainApp.java");

    System.out.println("2 + 3 = " + adder.add(2, 3));
    System.out.println("Previous addition result: " + adder.prev());
    
    honda.honk();
  }
}