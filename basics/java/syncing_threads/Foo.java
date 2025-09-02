package syncing_threads;

public class Foo implements Runnable {
  private volatile int value;
  private int result;

  public Foo(int v) {
    value = v;
  }

  public int getResult() {
    return result;
  }

  /** n 0 - 31 */
  private void heavyComputation() {
    for (int i = 0; i < 1e7; i++) {}
    
    int curr = value;
    int i = 1;
    while (curr > 0) {
      curr--; i <<= 1;
    }
    result = i;
  }
  
  @Override
  public void run() {
    heavyComputation();
  }
}
