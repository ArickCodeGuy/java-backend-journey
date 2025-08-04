package errorpack;

public class App {
  public static void main(String[] args) {
    int[] arr = {1,2,3};

    try {
      System.out.println("arr[8] is: " + arr[8]);
    }catch(Exception e) {
      System.out.println("Error accessing arr[8]");
    }finally {
      System.out.println("Finally run");
    }
  }
}