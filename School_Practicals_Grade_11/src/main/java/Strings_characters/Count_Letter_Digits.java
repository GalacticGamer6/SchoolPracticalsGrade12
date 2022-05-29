package Strings_characters;

import javax.swing.JOptionPane;

/**
 *
 * @author neeraavr
 */
public class Count_Letter_Digits {

    public static void main(String[] args) {
        
        int count = 0;
        //getting into loop
        String character_Str = JOptionPane.showInputDialog("Enter a character");
        char character = character_Str.charAt(0);
        Character.toUpperCase(character);
        
        while(character != 'x' && character != 'X'){
            
            Character.toUpperCase(character);
            
            count++;
           
         character_Str = JOptionPane.showInputDialog("Enter a character");
         character = character_Str.charAt(0);
        
        }
        
        System.out.println(count + " letters or digits have been entered");
    }    
}