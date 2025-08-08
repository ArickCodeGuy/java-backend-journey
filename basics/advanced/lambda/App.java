package lambda;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(3);
    arr.add(5);
    arr.add(7);
    arr.add(11);

    arr.forEach((i) -> System.out.print(String.valueOf(i) + ", "));
  }
}
