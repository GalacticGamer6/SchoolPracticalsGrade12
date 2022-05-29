/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings_characters;

import javax.swing.*;

public class Encoded_String {
    
    public static void main(String[] args) {
        String new_Word = "";
        String input = JOptionPane.showInputDialog("Enter a word");
        
        System.out.println("Your word: " + input);
        
        for(int i = 0 ; i < input.length() - 1 ; i++){
            
            switch(input.charAt(i)){
                case 'a': new_Word+= (char)((int)(input.charAt(i) - 1));
                          break;
                case 'e': new_Word+= (char)((int)(input.charAt(i) - 1));
                          break;
                case 'i': new_Word+= (char)((int)(input.charAt(i) - 1));
                          break;
                case 'o': new_Word+= (char)((int)(input.charAt(i) - 1));
                          break;
                case 'u': new_Word+= (char)((int)(input.charAt(i) - 1));
                          break;
                default: new_Word+= (char)((int)(input.charAt(i) + 1));
                          break;                          
            }
            
        }
        
        System.out.println("encoded word: " + new_Word);
    }
    
}
