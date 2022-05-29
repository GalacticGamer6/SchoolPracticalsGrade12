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
public class Encode_Char {
    public static void main(String[] args) {
        
       String input = JOptionPane.showInputDialog("Enter a leta");
        System.out.println("orignal char: " + input);
       char character = input.charAt(0);
       int char_Number = (int)character;
       
       char next_Char = (char)(char_Number+1);
        System.out.println("new char: " + next_Char);
    }
   
}
