package Past_Papers_Gr11.term_1;

import javax.swing.*;

public class Remove_Chars {
   
    
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter a name");
        String unnecessary = JOptionPane.showInputDialog("Enter the shii you want removed");
        String output = "";
        for(int i = 0; i < input.length(); i++){
            String currentL = ""+ input.charAt(i);
            
            if(!unnecessary.contains(currentL)){
                output+= currentL;
                
            }
            
        }
        
        System.out.println("Output: " + output);
    }
    
}
