
package Date_Time;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentManager {
    
    private  Student [] Students = new Student[10]; 
    private  int count = 0;
    
    
    public StudentManager(){
        
        try {
            
            Scanner sc = new Scanner(new File("data//students.txt"));
            
            while(sc.hasNext()){
                
                Scanner line_sc = new Scanner(sc.nextLine());
                String name = line_sc.next();
                String surname = line_sc.next();
                
                DateTimeFormatter input_formatter = DateTimeFormatter.ofPattern("")
                
                
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }
        
    }
    
}
