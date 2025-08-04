package simple;

// You can't extend from Honda
final public class Honda extends Car {
  public Honda() {}

  // This is polymorphism
  public void honk() {
    System.out.print("HONDA: ");
    super.honk();
  }
}