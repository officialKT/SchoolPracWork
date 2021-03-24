package javapracschoolwork;

import javax.swing.*;
import java.util.Scanner;

public class OldestName {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter names and ages");
        int numWords = 0;

        Scanner scStr = new Scanner(input);
        String oldestName = scStr.next();
        int oldestAge = scStr.nextInt();
        
        while (scStr.hasNext()) {
            String current = scStr.next();
            int currentAge = scStr.nextInt();
            
            if(currentAge > oldestAge){
               oldestAge =  currentAge;
                oldestName = current;
                System.out.println();
                
            }
            
            
            
        }
        scStr.close();
        System.out.println("The oldest name and age are: " + oldestName + ": " + oldestAge);
    }

}
