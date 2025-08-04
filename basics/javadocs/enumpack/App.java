package enumpack;

public class App {
  enum Clothing {
    HEAD,
    BODY,
    LEGS,
    FEET
  }
  
  public static void main(String[] args){ 
    Clothing clothes = Clothing.BODY;

    System.out.println(clothes);
  }
}
