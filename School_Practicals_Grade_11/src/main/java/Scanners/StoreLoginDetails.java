/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Neeraavr
 */
public class StoreLoginDetails {
    public static void main(String[] args) {
       
        FileWriter fw = null;
        try { 
            
            String filePath = "C:\\Users\\neeraavr\\Documents\\NetBeansProjects\\School_practicals_Gr11\\data\\loginDetails.txt";
            fw = new FileWriter(new File(filePath));
            
            String name = JOptionPane.showInputDialog("Enter a name here (Enter stop to stop) "); 
            
            int logins = 0; 
            
            while (name.equalsIgnoreCase("STOP") == false){
                logins++; 
                String password = JOptionPane.showInputDialog("Enter a password"); 
                
                PrintWriter pw = new PrintWriter(fw);
                
                pw.print(name);
                pw.print("#");
                pw.print(password);
                
               name = JOptionPane.showInputDialog("Enter a name here (Enter stop to stop) ");
               
               pw.close(); 
            }
            
            System.out.println("Logins: " + logins);
            
        } catch (IOException ex) {
            Logger.getLogger(StoreLoginDetails.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(StoreLoginDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
}
