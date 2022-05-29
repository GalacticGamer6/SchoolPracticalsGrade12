package Gr11_June_Prac_2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResultSet {

    private String name;
    private String email;
    private int score_alg;
    private int score_geo;
    private int score_trig;
    
    public ResultSet(String n , String e , int sA, int sG, int sT){
        
        name = n;
        email = e;
        score_alg = sA;
        score_geo = sG;
        score_trig = sT;
                
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String new_name){
        name = new_name;
    }
    
    public String toString(){
        return  name + "#" + email + "#" + score_alg + "#" + score_geo + "#" + score_trig + "#";
    }
    
    public double getRating(){
        return (score_alg * 0.35) + (score_geo * 0.45) + (score_trig * 0.2);
    }
    
    public String reformatName() throws FileNotFoundException{
        
        Scanner nameSc = new Scanner(name);
        String output = "";
        
        while(nameSc.hasNext()){
            String currentName = nameSc.next();
            
            if(nameSc.hasNext()){
                output += currentName.charAt(0);
            }else{
                output = currentName.toUpperCase()+ ", " + output;
            }
        }
        return output;
    }
    
    
    public String nameAndRating() throws FileNotFoundException{
        
        return reformatName() + ":\t" + getRating();
    } 
}
