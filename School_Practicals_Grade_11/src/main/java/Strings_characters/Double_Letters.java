package Strings_characters;

import javax.swing.JOptionPane;


public class Double_Letters {
    
    public static void main(String[] args) {
        
        
        String new_Word = "";
        String input = JOptionPane.showInputDialog("Enter your word");
       
        
        for(int i = 0 ; i < input.length() - 1 ; i++){
            
            
            
            
            
            System.out.println("i(outside if statement) = " + i);
            
            
            if(input.charAt(i) == input.charAt(i+1)){
                System.out.println("i = " + i);
                new_Word+= input.charAt(i);
                i++;    //so that we got the duplicate index and ince this if statement finishes, it wil prit the following index(the i+2)
                System.out.println("i = " + i);
            }
            
            else{
                new_Word+= input.charAt(i);
            }
        }
        
        System.out.println("NEW WORD: " + new_Word);
        
        
        
    }
}
    