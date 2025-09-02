package simple;

public class Adder {
  private int prevReturn;

  public Adder() {}

  public int prev() {
    return prevReturn;
  }

  public int add(int a, int b) {
    prevReturn = a + b;
    return prev();
  }
}
