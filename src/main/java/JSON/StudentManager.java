package JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class StudentManager {
    
    
    
    
    public StudentManager() throws FileNotFoundException{
        
        //First we need to get the contents of the json file into a string so we can work eith it
        
        //create a file path for the scanner
        String file_path = "data//JSON//Student.json";
        String StudentsJSON = "";
        
        Scanner sc = new Scanner(new File(file_path));
        
       //add entire file into String
        while(sc.hasNext()){
            
            StudentsJSON += sc.nextLine();
            
        }
        
        Student[] arr = parseStudents(StudentsJSON);
        System.out.println(arr[0].toString());
        System.out.println("");
        System.out.println(arr[1].toString());
        
        
    }
    
    
    public Student[] parseStudents(String StudentsJson){

        
        JSONArray jar = new JSONArray(StudentsJson);
        Student[] students = new Student[jar.length()];
        
        for(int i = 0; i < students.length ;i++){
            JSONObject student_as_json_object = jar.getJSONObject(i);
            
            String name = student_as_json_object.getString("name");
            int age = student_as_json_object.getInt("age");
            String strength = student_as_json_object.getString("strength");
            
            students[i] = new Student(name,age,strength);
            
        }
        
       return students;
        
    }
    
    
    
}
