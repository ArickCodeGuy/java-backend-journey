package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
  public static void main(String[] args) {
    String r = "test";
    Pattern p = Pattern.compile(r, Pattern.CASE_INSENSITIVE);
    String s = "Some test string";
    Matcher m = p.matcher(s);
    String s2 = "Some other string";
    Matcher m2 = p.matcher(s2);

    if (m.find()) {
      System.out.println("Match found in for regex: " + r + ". In string: " + s);
    } else {
      System.out.println("No match for: " + s);
    }

    if (m2.find()) {
      System.out.println("Match found in for regex: " + r + ". In string: " + s2);
    } else {
      System.out.println("No match for: " + s2);
    }
  }
}
