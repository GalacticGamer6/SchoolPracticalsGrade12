
package Past_Papers_Gr11.term_1;

import javax.swing.JOptionPane;

public class Flip_Case {
    
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter a sentence or something idk bruh");
        
        String output = "";
        
        for(int i = 0 ; i < input.length() - 1; i++){
         
            char currentL = input.charAt(i);
            if(Character.isUpperCase(currentL)){
                output += Character.toLowerCase(currentL);
            }
            
            else{
                output += Character.toUpperCase(currentL);
                
            }
            
            
        }
        
        System.out.println("OUtpout: " + output);
    }
    
    
}
