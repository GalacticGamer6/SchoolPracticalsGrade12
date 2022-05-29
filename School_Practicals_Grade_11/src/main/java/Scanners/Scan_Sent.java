package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Scan_Sent {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter a sentence");
        Scanner sc = new Scanner(input);
        
        int num_Words = 0;
        int num_3_Letter_Words = 0;
        
        while(sc.hasNext()){
        
            num_Words++;
            if(sc.next().length() == 3){
                num_3_Letter_Words++;
            }
           
        }
        
        System.out.println("Number of Words " + num_Words);
        System.out.println("Number of 3 letter words: " + num_3_Letter_Words);
        
        
    }
    
}
