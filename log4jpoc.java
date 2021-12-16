import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.sql.Timestamp;

public class log4jpoc {
  public static void main(String[] args) {
    try {
      File myObj = new File("testfile.txt");
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
        
      } else {
        System.out.println("File already exists, writing timestamp to it");
        BufferedWriter out = new BufferedWriter(
                new FileWriter("testfile.txt", true));
        
        out.write(timestamp+"\n");
        out.newLine();
        out.close();
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}