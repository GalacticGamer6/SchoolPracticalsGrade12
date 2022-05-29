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
public class Last_In_List {
    
    public static void main(String[] args) {
        int num_Names = 0;
        String input = JOptionPane.showInputDialog("Enter a name");
        String current_Least_Alphabetical = "";
        while(!input.equals("@@@")){
            
            num_Names++;
            if(current_Least_Alphabetical.compareTo(input) < 0){
                current_Least_Alphabetical = input;
            }
            
            input = JOptionPane.showInputDialog("Enter a name");
        }
        
        System.out.println("number of names: " + num_Names);
        System.out.println("Least alphabetical: " + current_Least_Alphabetical);
    }
    
}
