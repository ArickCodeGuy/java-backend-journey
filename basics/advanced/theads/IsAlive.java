package theads;

public class IsAlive {
  public static void main(String[] args) {
    Thread t = new Thread(() -> someHeavyComputation());
    
    t.start();

    while (t.isAlive()) {
      System.out.println("Waiting for thread...");
    }

    System.out.println("Thread finish");
  }

  public static void someHeavyComputation() {
    for (int i = 0; i < 1e6; i++) {}
    System.out.println("someHeavyComputation from thread");
  }
}
