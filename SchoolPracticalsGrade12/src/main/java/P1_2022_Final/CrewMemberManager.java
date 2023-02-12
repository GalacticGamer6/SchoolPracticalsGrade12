package P1_2022_Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrewMemberManager {
    
    private CrewMember[] crew_members = new CrewMember[80];
    private int size = 0;
    
    public CrewMemberManager(){
        
        try {
            Scanner file_sc = new Scanner(new File("data//crewmembers.txt"));
        
            while(file_sc.hasNext()){
                
                String line = file_sc.nextLine();
                Scanner line_sc = new Scanner(line).useDelimiter("#");
                
                String fullname = line_sc.next();
                int crew_id = line_sc.nextInt();
                String department = line_sc.next();
                
                if(line_sc.hasNext()){
                    
                    int rank = line_sc.nextInt();
                    String date_string = line_sc.next();
                    
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date_promoted = LocalDate.parse(date_string, formatter);
                    
                    Officer o = new Officer(fullname,crew_id,department,rank,date_promoted);
                    crew_members[size] = o;
                }
                else{
                    
                    CrewMember c = new CrewMember(fullname,crew_id,department);
                    crew_members[size] = c;
                }
                
                size++;
                line_sc.close();
                     
            }
        
        file_sc.close();
        
        
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }
        
    }
    
    public String toString(){
        
        String output = "";
        
        for(int i = 0; i < size; i++){
         output += crew_members[i].toString() + "\n";
        }
        
        return output;
    }
    
    public int findCrewMember(int crew_id){
        
       int pos = 0;
       
       for(int i = 0 ; i < size;i++){
           if(crew_members[i].getCrewID() == crew_id){
               pos = i;
           }
       }
       return pos;
    }
    
    public void processTestResults(){
        
        try {
            Scanner scanner = new Scanner(new File("data//testResults.txt"));
            
            while(scanner.hasNextLine()){
                
                int crew_id = scanner.nextInt();
                int test_result = scanner.nextInt();
                
                CrewMember current_crew_member = crew_members[findCrewMember(crew_id)];
                
                if(current_crew_member.ge)
                
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }
        
        
        
    }
    
}
