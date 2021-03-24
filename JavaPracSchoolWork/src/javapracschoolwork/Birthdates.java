
package javapracschoolwork;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Birthdates {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\CLLB13\\Documents\\NetBeansProjects\\Classwork\\src\\classwork\\Birthdates.txt");
        Scanner scFile = new Scanner (f);
       
        
        while (scFile.hasNext()){
            String line = scFile.nextLine();
            
            Scanner scLine = new Scanner (line);
            scLine.useDelimiter("#");
            
            String name = scLine.next();
            String surname = scLine.next();
            String date = scLine.next();
            scLine.close();
            System.out.println(name + "\t" + "\t" + surname + "\t" + date );       
           
        }
        scFile.close();
        System.out.println("The birthdates are" );
      
    }
    
}
