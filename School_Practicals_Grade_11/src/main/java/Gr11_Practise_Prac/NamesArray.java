
package Gr11_Practise_Prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NamesArray {
    
    private int size = 0;
    private String [] names;
    
    public NamesArray(){
        
        names = new String[100];
        
        try {
            
            Scanner sc = new Scanner(new File("data//names.txt"));
        
            while(sc.hasNext()){
            
                names[size] = sc.next();
                size++;
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
        
        
    }
    
    public String toString(){
        
        String output = "";
        
        for(int i = 0; i < size; i++){
            
            output+= names[i] + " ";
            
        }
        return output;
    }
    
    public void sort(){
        
        for(int last_index = size - 1; last_index >= 0; last_index--){
            for(int current_index = 0; current_index < last_index; current_index++){
                
                if(names[current_index].compareTo(names[current_index + 1]) > 0){
                    
                    String temp = names[current_index];
                    names[current_index] = names[current_index + 1];
                    names[current_index + 1] = temp;
                    
                }
            }
        }
        
    }
    
    public int search(String name){
        
        sort();
        
        int start = 0;
        int end = size - 1;
        int index = 0;
        
        while(start <= end){
            
            int mid = start + end / 2;
            
            if(names[mid].equalsIgnoreCase(name)){
                return mid;
            }
            
            else if(names[mid].compareTo(name) < 0){
                start = mid + 1;
            }
            
            else if(names[mid].compareTo(name) > 0){
                end = mid - 1;
            }   
        
        }
        
        return -1;
    }
    
    
    public void shiftUp(int index){
        
        for(int i = size; i > index;i--){
            names[i] = names[i - 1];
        }
        size++;
    }
    
    public void insert(String name){
        
        
        int insertion_index = 0;
        
        for(int i = 0; i < size;i++){
            
            if(names[i].compareToIgnoreCase(name) > 0){
                insertion_index = i;
                break;
            }
            
        }
        
        shiftUp(insertion_index);
        names[insertion_index] = name;
    }
    
    public void shiftDown(int index){
        
        for(int i = index; i < size;i++){
            names[i] = names[i + 1];
        }
        size--;
    }
    
    public void delete(String name){
        
        int index_to_delete = search(name);
        
        shiftDown(index_to_delete);
    }
    
}
