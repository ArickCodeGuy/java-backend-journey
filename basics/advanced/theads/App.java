package theads;

public class App {
  public static void main(String[] args) {
    // Java 8+
    Thread t = new Thread(() -> run());

    t.start();

    System.out.println("Run from main");
  }

  public static void run() {
    System.out.println("Run from thread");
  }
}
