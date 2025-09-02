package simple;
public class Car {
  protected String brand;

  public Car(String brand) {
    this.brand = brand;
  }
  
  public Car() {
    this("unknown");
  }

  public String getBrand() {
    return brand;
  }

  public void honk() {
    System.out.println("Car goes: 'Honk, Honk!'");
  }
}
