package Gr11_June_Prac_2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.accessibility.AccessibleExtendedText;

public class ResultSetManager {
    
    private String file_path;
    
    public ResultSetManager(String f){
        
        file_path = f;
        
    }
    
    public void saveResult(String n , String e , int sA , int sG, int sT) throws IOException{
        
        ResultSet set = new ResultSet(n,e,sA,sG,sT);
        
        FileWriter fw = new FileWriter(new File(file_path) , true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(set.toString());
        pw.close();
        fw.close();
        
    }
    
    public void printRatings() throws FileNotFoundException{
        
        int result_sets_saved = 0;
        ResultSet highest_result_set = null;
        int total_rating = 0;
        
        
        System.out.println("MATHAPP - ALL RESULTS");
        System.out.println("---------------------");
        
        Scanner sc = new Scanner(new File(file_path)).useDelimiter("#");
        
        while(sc.hasNextLine()){
            
            String line = sc.nextLine();
            Scanner line_scanner = new Scanner(line).useDelimiter("#");
            
            String name = line_scanner.next();
            String email = line_scanner.next();
            int algebra_score = line_scanner.nextInt();
            int geometry_score = line_scanner.nextInt();
            int trig_score = line_scanner.nextInt();
            
            ResultSet current_set = new ResultSet(name,email,algebra_score,geometry_score,trig_score);
            result_sets_saved++;
            
            if(highest_result_set == null){
                highest_result_set = current_set;
            }
            else if(current_set.getRating() > highest_result_set.getRating()){
                highest_result_set = current_set;
            }
            
            System.out.println(current_set.nameAndRating());
            
            total_rating += current_set.getRating();
            line_scanner.close();
        }
        
        sc.close();
        
        System.out.println("There are " + result_sets_saved + " results with an average of: " + (total_rating / result_sets_saved));
        System.out.println("The highest rating was:" + highest_result_set.getRating());
    }
}
