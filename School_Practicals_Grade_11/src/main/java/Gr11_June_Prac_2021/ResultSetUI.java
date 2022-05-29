package Gr11_June_Prac_2021;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ResultSetUI {
    
    public static void main(String[] args) throws IOException {
        
        ResultSetManager rsm = new ResultSetManager("data\\Results.txt");
        
        String name = JOptionPane.showInputDialog("Enter all your names");
        String email = JOptionPane.showInputDialog("Enter your email");
        int alg_score = Integer.parseInt(JOptionPane.showInputDialog("Enter your algebra score"));
        int geo_score = Integer.parseInt(JOptionPane.showInputDialog("Enter your geometry score"));
        int trig_score = Integer.parseInt(JOptionPane.showInputDialog("Enter your trig score"));
        
        rsm.saveResult(name, email, alg_score, geo_score, trig_score);
        
        rsm.printRatings();
    }
    
}
