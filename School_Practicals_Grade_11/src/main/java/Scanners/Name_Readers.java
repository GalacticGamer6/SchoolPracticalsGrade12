
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Name_Readers {
    
    public static void main(String[] args) {
        
    String file_name = "data\\Names.txt"; 
    String most_alphabetical = "";
    String current_name = "";    
    
    try {
            Scanner sc = new Scanner(new File(file_name));
            most_alphabetical = sc.nextLine();
            System.out.println(most_alphabetical);
            while(sc.hasNext()){
                current_name = sc.nextLine(); 
                System.out.println(current_name);
                if(current_name.compareTo(most_alphabetical) < 0){
                    
                    most_alphabetical = current_name;
                }
            }
            
            System.out.println("Most Alphabetical: " + most_alphabetical);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Name_Readers.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
