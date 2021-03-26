
package javapracschoolwork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;




public class ReportCard {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileWriter f = new FileWriter("C:\\Users\\CLLB13\\Documents\\NetBeansProjects\\SchoolPracWork\\JavaPracSchoolWork\\src\\javapracschoolwork\\Data.txt", true);
        PrintWriter outFile = new PrintWriter(f);
        
        String name = JOptionPane.showInputDialog("Write your name down here");
        String surname = JOptionPane.showInputDialog("Write your surname down here");
        String studentNumber = JOptionPane.showInputDialog("Write your student niumber here");
        String grade = JOptionPane.showInputDialog("Enter your grade");
        String subject1 = JOptionPane.showInputDialog("Enter subject 1");
        String subject2 = JOptionPane.showInputDialog("Enter subject 2");
        String subject3 = JOptionPane.showInputDialog("Enter subject 3");
        String subject4 = JOptionPane.showInputDialog("Enter subject 4");
        String subject5 = JOptionPane.showInputDialog("Enter subject 5");
        String subject6 = JOptionPane.showInputDialog("Enter subject 6");
        
        String out = name +"$" + surname + "#" + grade + "#" + studentNumber + "#" + subject1 + "$" + subject2 + "$" + subject3 + "$" + subject4 + "$" + subject5 + "$" + subject6 + "#";
        
        outFile.println(out);
        
        outFile.close();
                
                }
    //name+"$"+surname+"#"+studentNumber"#"+subjects
     //scanner to seperate the #
    // scanner to seperate the $
    //
}
