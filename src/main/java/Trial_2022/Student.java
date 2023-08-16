package Trial_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Student {
    
    private String student_name;
    private LocalDate date_of_birth;
    private String studentID;
    private Module[] modules;
    private int size;

    public Student(String student_name, LocalDate date_of_birth) {
        
        this.student_name = student_name;
        this.date_of_birth = date_of_birth;
        modules = new Module[15];
        
        String file_path = "data//ExampleStudentModules.txt";
        
        try {
            
            Scanner file_scanner = new Scanner(new File(file_path));
            
            while(file_scanner.hasNext()){
            
                String current_line = file_scanner.nextLine();
                Scanner line_scanner = new Scanner(current_line).useDelimiter("#");
                
                String courseID = line_scanner.next();
                String moduleID = line_scanner.next();
                String module_name = line_scanner.next();
                        
                Module current_module = new Module(courseID,moduleID,module_name);
                modules[size] = current_module;
                size++;
            
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }
        
        String assessments_file_path = "data//ExampleStudentAssessments.txt";
        
        try {
            
            Scanner assessments_file_scanner = new Scanner(new File(assessments_file_path));
        
            while(assessments_file_scanner.hasNext()){
            
                String line = assessments_file_scanner.nextLine();
                Scanner assessments_line_scanner = new Scanner(line).useDelimiter("#");
                
                String moduleID = assessments_line_scanner.next();
                String assessment_name = assessments_line_scanner.next();
                int total = assessments_line_scanner.nextInt();
                int mark = assessments_line_scanner.nextInt();
                double weighting = assessments_line_scanner.nextDouble();
                
                //converting string date to date
                String date_written_string = assessments_line_scanner.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate date_written = LocalDate.parse(date_written_string,formatter);
                //
                
                boolean isExam = assessments_line_scanner.nextBoolean();
                
                Assessment current_assessment = new Assessment(moduleID, assessment_name, total, mark, weighting, date_written, isExam);
                addAssessment(current_assessment, moduleID);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ASSESSMENTS FILE NOT FOUND");
        }
        
        
    }
    
    private void addAssessment(Assessment new_assessment, String assessment_moduleID){
    
        for(int i = 0; i < size ;i++){
        
            if(modules[i].getModuleID().equals(assessment_moduleID)){
            
                modules[i].addAssessment(new_assessment);
            
            }
        
        }
    
    
    }
    
    public String toString(){
        
        String output = "STUDENT: ";
        output+= this.student_name;
        
        for(int i = 0; i < size; i++){
        
            output += modules[i].toString() + "\n";
            
        }
        
        return output;
        
    }
    
    private void generateStudentID(){
    
        Scanner name_scanner = new Scanner(this.student_name);
        
        String first_name = name_scanner.next();
        
        String last_name = " ";
        while(name_scanner.hasNext()){
        
            String current = name_scanner.next();
            last_name = current;
        }
        
        String first_3_surname = last_name.substring(0,2).toUpperCase();
        String first_3_name = first_name.substring(0,2).toUpperCase();
        
        int random_3 = (int)(Math.random() * 900 ) + 100;
        String last_2 = date_of_birth.format(new DateTimeFormatter())
    }
    
    
    
}
