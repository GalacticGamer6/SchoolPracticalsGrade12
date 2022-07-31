package Gr11_Practise_Prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NamesArray {

    private String [] names = new String[100];
    private int size = 0;
        
    public NamesArray() {
        
        try {
            
            Scanner sc = new Scanner(new File("data//names.txt"));
            
            while(sc.hasNext()){
                
                String name = sc.next();
                names[size] = name;
                size++;
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("HeheheA file not found");
        }
        
        
        
    }
    
    public String toString(){
        String output = "";
        for(int i  = 0 ; i < size; i++){
        
            output += names[i] + " ";   
        
        }
        
        return output;
    }
    
    public void sort(){
        
        for(int last_index = size - 1 ; last_index >= 0; last_index--){
            for(int current_index = 0; current_index < last_index; current_index++){
                
                if(names[current_index].compareTo(names[current_index + 1]) < 0){
                    String temp = names[current_index];
                    names[current_index] = names[current_index + 1];
                    names[current_index + 1] = temp;
                }
            }
        }
        
    }
    
    public int search(String name){
        
        int pos = 0;
        
        for(int i = 0 ; i < size ; i++){
            if(names[i].equals(name)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    
    public void insert(String name){
        
        int insert_pos = 0;
        
        for(int i = 0; i < size; i++){
            if(names[i].compareTo(name) > 0){
                insert_pos = i;
                break;
            }
        }
        
        shiftUp(insert_pos);
        names[insert_pos] = name;
        
    }
    
    public void shiftUp(int index){
        
        for(int i = size; i > index;i--){
            names[i] = names[i - 1];
        }
        
    }
    
    public void delete(String name){
        
        int index = search(name);
        
        if(index >= 0){
        shiftDown(index);
        }
    }
    
    public void shiftDown(int index){
        for(int i = index; i < size; i++){
            names[i] = names[i + 1];
        }
    }
}
