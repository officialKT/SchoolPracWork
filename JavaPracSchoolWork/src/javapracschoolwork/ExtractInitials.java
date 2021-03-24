
package javapracschoolwork;
import java.util.*;
import javax.swing.JOptionPane;

public class ExtractInitials {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Write your full name");
        Scanner scString = new Scanner(input);
        String name ;
        while(scString.hasNext()){
            name = scString.next();
            char initials = name.charAt(0);
            System.out.print(initials);
            
        }
        scString.close();
       
    }
}
