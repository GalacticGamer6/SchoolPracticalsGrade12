package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Details {

    public static void main(String[] args) {
        
        String mugshot = JOptionPane.showInputDialog("Enter NAME, ID, HEIGHT, SMOKING");
        
        Scanner sc = new Scanner(mugshot);
        
        String name = sc.next();
        String id_Num = sc.next();
        double height = sc.nextDouble();
        String smoke = sc.next();
        
        System.out.println("Name: " + name + "\nID NUMBER: " + id_Num + "\nHeight: " + height + "\nActive Smoker: " + smoke);
        
        
    }
    
}
