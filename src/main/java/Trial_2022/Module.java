package Trial_2022;

import java.time.LocalDate;

public class Module {

    
    private String courseID;
    private String moduleID;
    private String module_name;
    private Assessment assessments[];
    private int size = 0;
    
    public static final int PASS_MARK = 50;

    public Module(String courseID, String moduleID, String module_name) {
        this.courseID = courseID;
        this.moduleID = moduleID;
        this.module_name = module_name;
        
        assessments = new Assessment[15];
        
    }
    
    public String getModuleName(){
    
        return module_name;
    }
    
    public String getModuleID(){
    
        return moduleID;
    }
    
    public void addAssessment(Assessment a){
    
        assessments[size] = a;
        size++;
    }
    
    public LocalDate getExamDate(){
    
        for(int i = 0; i < size ;i ++){
        
            if(assessments[i].isExam()){
            
                return assessments[i].getDateWritten();
                
            }
            
        }
    
        return null;
    }
    
    public double getModuleMark(){
    
        double total_percentage = 0;
        
        for(int i = 0; i < size ; i++){
        
            double percentage = assessments[i].getMark() / assessments[i].getTotal();
            double weighted_percentage = percentage * assessments[i].getWeighting();
            total_percentage += weighted_percentage;
        }
    
        return total_percentage;
    }
    
    public boolean hasPassed(){
    
        if(getModuleMark() > Module.PASS_MARK){
        
            return true;
            
        }
        else{
            
            return false;
        }
        
    }
    
    public String toString(){
    
        String output = "";
        output += "Module: ";
        
        for(int i = 0;i < size;i++){
        
            output += assessments[i].toString() + "|";
        
        }
        return output;
    }
    
}
