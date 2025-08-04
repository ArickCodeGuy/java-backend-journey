package filepack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
  public static final String fileName = "test.txt";
  
  public static void main(String[] args) {
    readFile();
    writeToFile();
  }

  public static void writeToFile() {
    try {
      FileWriter myWriter = new FileWriter(fileName, true);
      myWriter.write("\n1");
      myWriter.close();

      System.out.println("Successfully appeended '1' to " + fileName);
    } catch(IOException e) {
      e.printStackTrace();
    }
  }

  public static void createFile() {
    try {
      FileWriter myFileWriter = new FileWriter(fileName);
      myFileWriter.write("");
      myFileWriter.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }

  public static void readFile() {
    try {
      File myFile = new File(fileName);
      Scanner myScanner = new Scanner(myFile);

      while (myScanner.hasNextLine()) {
        String data = myScanner.nextLine();
        System.out.println(data);
      }
      myScanner.close();
    } catch(FileNotFoundException e) {
      createFile();
      
      System.out.println("Error reading file " + fileName);
    }
  }
}
