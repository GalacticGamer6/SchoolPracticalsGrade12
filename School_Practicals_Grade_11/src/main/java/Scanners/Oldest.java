package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Oldest {

    public static void main(String[] args) {
        
        int oldest_Age  = 0;
        String oldest_Boy = "";
        
        
        String input = JOptionPane.showInputDialog("Enter your name and age");
        
        while(!input.equalsIgnoreCase("Stop")){
         
         Scanner sc = new Scanner(input);
         
         String name = sc.next();
         int age = sc.nextInt();
            
         if(age > oldest_Age){
             
         oldest_Age = age;
         oldest_Boy = name;
             
         }
         
         input = JOptionPane.showInputDialog("Enter your name and age");
         
        }    
         
        
        System.out.println("The Oldest Boy is: " + oldest_Boy);
    }
    
}
