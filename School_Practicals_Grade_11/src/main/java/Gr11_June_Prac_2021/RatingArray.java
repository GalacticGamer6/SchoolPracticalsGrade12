package Gr11_June_Prac_2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class RatingArray {
    
    private int ratings [];
    private int size;
    
    public RatingArray() throws FileNotFoundException{
        
        ratings = new int[150];
        size = 0;
        Scanner sc = new Scanner(new File("data\\ClientRatings.txt"));
        
        while(sc.hasNext()){
            
            ratings[size] = sc.nextInt();
            size++;
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public int getElement(int index){
        return ratings[index];
    }
    
    public int getFirst(){
        return ratings[0];
    }
    
    public int getLast(){
        return ratings[size - 1];
    }
    
    public String toString(){
        String output = "[";
        for(int i = 0; i < size ;i++){
            if(i == size - 1){
                output += ratings[i];
            }
            output += ratings[i] + ", ";
        }
        
        return output + "]";
    }
    
    public double getAverage(){
        double total  = 0;
        
        for(int i = 0 ; i < size ; i++){
            total += ratings[i];
        }
        
        return total / size;
    }
    
    public void sort(){
        
        
        for(int last_index = size - 1 ; last_index >= 0 ; last_index--){
            for(int current_index = 0 ; current_index < last_index; current_index++){
                if(ratings[current_index] > ratings[current_index + 1]){
                    int temp = ratings[current_index];
                    ratings[current_index] = ratings[current_index + 1];
                    ratings[current_index + 1] = temp;
                }
                
                
            }
        }
    }
}
