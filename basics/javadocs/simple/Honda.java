package simple;
public class Honda extends Car {
  public Honda() {}

  // This is polymorphism
  public void honk() {
    System.out.print("HONDA: ");
    super.honk();
  }
}