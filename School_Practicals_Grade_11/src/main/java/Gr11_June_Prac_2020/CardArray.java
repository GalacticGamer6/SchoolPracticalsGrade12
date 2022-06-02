package Gr11_June_Prac_2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CardArray {

    private Card[] card_arr = new Card[20];
    private int size;
    
    public CardArray(){
    
        String file_path = "data//Cards.txt";
        try {
            
            Scanner sc = new Scanner(new File(file_path));
            
            while(sc.hasNext()){
                
                String line = sc.nextLine();
                Scanner line_sc = new Scanner(line).useDelimiter(";");
                
                String name = line_sc.next();
                String type = line_sc.next();
                int basic = line_sc.nextInt();
                int special = line_sc.nextInt();
                int leader = line_sc.nextInt();
                int unique = line_sc.nextInt();
                
                line_sc.close();
                
                card_arr[size] = new Card(name,type,basic,special,leader,unique);
                size++;
                
            }
            
            sc.close();
                    
                    } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        
    }
    
    public void ArrayToString(){
        String output = "";
        
        for(int i = 0; i < size ; i++){
            System.out.println(card_arr[i].toString());
        }
    }
    
    public void Sort(){
        
        for(int last_index = size - 1 ; last_index >= 0; last_index--){
            for(int current_index = 0; current_index < last_index; current_index++){
                
                if(card_arr[current_index].getName().compareTo(card_arr[current_index + 1].getName()) > 0){
                    Card temp = card_arr[current_index];
                    card_arr[current_index] = card_arr[current_index + 1];
                    card_arr[current_index + 1] = temp;
                }
            }
        }
        
    }
    
    public Card Search(String name){
        int mid = 0;
        int start = 0;
        int end = size;
        
        Card temp = null;
        boolean is_found = false;
        
        while(start <= end && is_found == false){
            mid = (start + end) / 2;
            
            if(name.compareTo(card_arr[mid].getName()) > 0){
                start = mid + 1;
            }
            else if(name.compareTo(card_arr[mid].getName()) < 0){
                end = mid - 1;
            }
            else{
                is_found = true;
                temp = card_arr[mid];
            }
        }
        return temp;
    }
    
    public String playCards(String card_1,String card_2){
        
        Card first = Search(card_1);
        Card second = Search(card_2);
        String output = "";
        
        output = first.toString() + "\n" + second.toString();
        
        if(first.calcPoints() > second.calcPoints()){
            output += first.getName() + " wins with: " + first.calcPoints();
        }
        else if(second.calcPoints() > first.calcPoints()){
            output += second.getName() + " wins with: " + second.calcPoints();
        }
        return output;
    }
    
}
