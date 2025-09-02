package sorting;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    Integer[] arr = {5,3,1,7,11,2,4};

    Arrays.sort(arr, (a, b) -> {
      if (a % 2 == 0 && b % 2 != 0) return -1;
      if (a % 2 != 0 && b % 2 == 0) return 1;

      return a - b > 0 ? 1: -1;
    });

    System.out.println(Arrays.toString(arr));
  }
}
