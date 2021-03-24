
package javapracschoolwork;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class Rowers {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         File f = new File("C:\\Users\\CLLB13\\Downloads\\Rowing.txt");
        Scanner scFile = new Scanner (f);
        PrintWriter outFile = new PrintWriter (new FileWriter("C:\\Users\\CLLB13\\Downloads\\Data.txt"));
        
        
        while (scFile.hasNextLine()){
          String line = scFile.nextLine();
          
         Scanner scLine = new Scanner (line);
            scLine.useDelimiter("#");
            
            String firstNum = scLine.next();
            String name = scLine.next();
            String type = scLine.next();
            String lastNum = scLine.next();
            
            Scanner scName = new Scanner (name);
            scName.useDelimiter(",");
            String firstname = scName.next();
            String surname = scName.next();
            
            outFile.println(firstNum + "\t" +  surname + "\t" + firstname + "\t" + type + "\t" + lastNum );
          
            
        }
          scFile.close();
          outFile.close();
       
    }
    
}
