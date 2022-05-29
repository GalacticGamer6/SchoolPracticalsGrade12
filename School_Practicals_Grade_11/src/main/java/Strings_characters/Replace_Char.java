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
public class Replace_Char {
    
    public static void main(String[] args) {
        
        String t = "";
        t = JOptionPane.showInputDialog("Enter a word ");
        
        while(t.indexOf(" ") > 0){
            
             t = t.substring(0,t.indexOf(" ")) + "*" +  t.substring(t.indexOf(" ") + 1,t.length());
             
        }
        
        System.out.println("Output: " + t);
 
    }
}    
        
//        for(int i = 0 ; i < input.length(); i++){
//            
//            
//            if(i == input.indexOf(" ")){
//                
//                new_Input+= "*";
//            }
//            else{
//                new_Input+= input.charAt(i);
//            }
//        }
             

