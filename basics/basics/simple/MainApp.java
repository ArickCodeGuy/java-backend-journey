package simple;
public class MainApp {
  public static Adder adder = new Adder();
  public static Honda honda = new Honda();
  
  // static -> MainApp owns it
  // Loads with class
  // final -> Constant. Can not be changed
  public static final double PI = 3.1415;
  
  public static void main(String[] args) {
    System.out.println("Starting MainApp.java");
    
    System.out.println("2 + 3 = " + adder.add(2, 3));
    System.out.println("Previous addition result: " + adder.prev());
    
    honda.honk();
  }
}