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
public class Encode_With_Three_Letters {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("enter a word");
        String input_Uppercase = input.toUpperCase();
        if(input.length() > 3){
            
            String first_3_Letters = input_Uppercase.substring(0, 3);
            String rest_Of_Word = input_Uppercase.substring(3,input.length());
            System.out.println("Rest of word: " + rest_Of_Word);
            String new_Rest_Of_Word = "";
            
            for(int i = 0 ; i < rest_Of_Word.length() ; i++){
                
                if(rest_Of_Word.charAt(i) == 'Z'){
                    new_Rest_Of_Word += 'A';
                }
                else{
                    new_Rest_Of_Word += (char)((int)rest_Of_Word.charAt(i)+ 1);
                    System.out.println((char)((int)rest_Of_Word.charAt(i)+ 1) + " has been added");
                }
                
            }
            
            System.out.println(new_Rest_Of_Word + first_3_Letters);    
                
            
        }
        
        else{
            
            String reversed_Input = "";
            
            for(int i = input_Uppercase.length()-1 ; i >= 0 ; i--){
                
                if(input_Uppercase.charAt(i) == 'Z'){
                    reversed_Input+= 'A';
                }
                
                else{
                    reversed_Input += (char)((int)input_Uppercase.charAt(i) + 1);
                }
            }
            System.out.println(reversed_Input);
        }
        
    }
    
}
