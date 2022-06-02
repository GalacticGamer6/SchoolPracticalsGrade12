package Gr11_June_Prac_2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ISPArray {

    private ISP[] ISP_array = new ISP[100];
    private int size;
    
    public ISPArray(){
        
        try {
            Scanner sc = new Scanner(new File("data//isps.txt"));
            
            while(sc.hasNext()){
                
                String Line = sc.nextLine();
                Scanner line_scanner = new Scanner(Line).useDelimiter(",");
                
                String ip = line_scanner.next();
                int total = line_scanner.nextInt();
                String ISP = line_scanner.next();
                String date = line_scanner.next();
                
                line_scanner.close();
                
                ISP_array[size] = new ISP(ip,total,ISP,date);
                size++;
                
            }
            
            sc.close();
 
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        
    }
    
    public void ArraytoString(){
        for(int i = 0 ; i < size; i++){
            System.out.println(ISP_array[i].toString());
        }
    }
    
    public void Sort(){
        for(int last_index = size - 1 ; last_index >= 0 ; last_index--){
            for(int current_index = 0 ; current_index <last_index; current_index++){
                if(ISP_array[current_index].getISP().compareTo(ISP_array[current_index + 1].getISP()) > 0){
                    ISP temp = ISP_array[current_index];
                    ISP_array[current_index] = ISP_array[current_index + 1];
                    ISP_array[current_index + 1] = temp;
                }
            }
        }
    }
    
    private void shiftKill(int pos){
        
        for(int i = pos ; i < size - 1; i++){
            ISP_array[i] = ISP_array[i + 1];
        }
        
        size--;
    }
    
    public String deleteInvalid(){
        String removed = "DELETED ISPs:\n";
        
        for(int i = 0 ; i < size; i++){
            if(!ISP_array[i].validIP()){
                removed += ISP_array[i].getISP() + "\n";
                shiftKill(i);
            }
        }
        
        return removed;
    }
    
    
}
