package basics.advanced.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class App {
  public static void main(String[] args) {
    int[] array = {1,2,3,4,5};
    System.out.println("Array: " + Arrays.toString(array));

    ArrayList<String> cars = new ArrayList<>();
    cars.add("Honda");
    cars.add("Mazda");
    cars.add("Hyndai");
    System.out.println("ArrayList: " + cars);

    HashSet<String> names = new HashSet<>();
    names.add("Andy");
    names.add("Andy");
    names.add("Sandy");
    System.out.println("HashSet: " + names);
    
    HashMap<String, Integer> brandCreateDates = new HashMap<>();
    brandCreateDates.put("Google", 1998);
    brandCreateDates.put("Facebook", 2004);
    brandCreateDates.put("Instagram", 2010);
    System.out.println("HashMap: " + brandCreateDates);

    Iterator<String> carsIterator = cars.iterator();
    while (carsIterator.hasNext()) {
      System.out.println("CarsIterator: " + carsIterator.next());
    }
  }
}
