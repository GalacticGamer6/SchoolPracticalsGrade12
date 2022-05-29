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
public class Convert_Date {
  
    public static void main(String[] args) {
        String day_Str = "";
        String month_Str = "";
        String year_Str = "";
        String date = JOptionPane.showInputDialog("Enter a date DDMMYY");
        
        for(int i = 0; i < 2 ;i++){
            day_Str += date.charAt(i);
            month_Str += date.charAt(i+2);
            year_Str += date.charAt(i+4);
            
        }
        int month = Integer.parseInt(month_Str);
        int day = Integer.parseInt(day_Str);
        
        System.out.println(year_Str + "/" + month + "/" + day);
    }
    
}
