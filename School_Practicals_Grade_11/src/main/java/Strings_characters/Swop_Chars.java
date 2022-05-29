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
public class Swop_Chars {
    
    public static void main(String[] args) {
        
        String word_1 = JOptionPane.showInputDialog("Enter your first word");
        String word_2 = JOptionPane.showInputDialog("Enter your second word");
      
        char [] new_Word_1 = word_1.toCharArray();
        char [] new_Word_2 = word_2.toCharArray();
        
        new_Word_1[0] = word_2.charAt(0);
        new_Word_2[0] = word_1.charAt(0);
        
        word_1 = String.valueOf(new_Word_1);
        word_2 = String.valueOf(new_Word_2);
        
        System.out.println("New word 1: " + word_1);
        System.out.println("New Word 2: " + word_2);
        
    
    }
    
}