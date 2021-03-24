
package javapracschoolwork;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class CountWords {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Type out a sentence");
        int numWords = 0;
        Scanner scString = new Scanner(input);
        
        while(scString.hasNext()){
            System.out.println(scString.next());
            numWords ++;
            
        }
        System.out.println("this is the number of words that was in your input:" + numWords);;
    }
    
}
