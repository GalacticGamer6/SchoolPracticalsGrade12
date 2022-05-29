package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Number_Readers {
    
    public static void main(String[] args) {
        String file_path = "data\\Numbers.txt";
        int total = 0;
        int current_num = 0;
        int count = 0;
        
        try {
            
            Scanner sc = new Scanner(new File(file_path));
            while(sc.hasNextLine()){
                current_num = sc.nextInt();
                total += current_num;
                System.out.println("current Num: " + current_num);
                count++;
            }
            
            System.out.println("avg: " + total / count);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Number_Readers.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
