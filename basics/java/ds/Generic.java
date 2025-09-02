package ds;

public class Generic<T> {
  T value;

  public T get() {
    return value;
  }

  public void set(T v) {
    value = v;
  }
}
