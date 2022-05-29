/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings_characters;

import javax.swing.JOptionPane;

/**
 *
 * @author Neeraav Ranjit
 */
public class Convert_Chars {
    
    public static void main(String[] args) {
        
        int number = 0;
        //getting into loop
        String character_Str = JOptionPane.showInputDialog("Enter a character");
        char character = character_Str.charAt(0);
        
        
        while(Character.isLetterOrDigit(character) | Character.isWhitespace(character)){
            
            if(Character.isDigit(character)){
                System.out.println("its a digit");
                number = Character.getNumericValue(character);
                
                System.out.println("original number: " + number + "\t square rooted: " + Math.sqrt(number));
            }
            else if(Character.isLetter(character)){
                System.out.println(Character.toUpperCase(character));
            }
            else if(Character.isWhitespace(character)){
                int ascii_Value = (int)character; 
                System.out.println(ascii_Value);
            }
           
         character_Str = JOptionPane.showInputDialog("Enter a character");
         character = character_Str.charAt(0);
        
        }
        
    }
}
