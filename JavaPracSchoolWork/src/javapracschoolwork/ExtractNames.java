package javapracschoolwork;
import java.util.*;
import javax.swing.JOptionPane;

public class ExtractNames {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Write your full name");
        Scanner scStr = new Scanner(input);
        String output = "";
       
        
        while(scStr.hasNext()){
            
           String name = scStr.next();
           if(scStr.hasNext()){
            
           output += name.charAt(0);
            
           }
           else{
               output += " " + name;
           }
            
           
        }
        scStr.close();
         System.out.println(output);
       
    }
}
