package Strings_characters;

import javax.swing.JOptionPane;

public class Extract_Initials {
    
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter your full name");
        String output = "";
        
        while(input.indexOf(" ") > 0){            
            
            output += "" + input.charAt(0);
            input = input.substring(input.indexOf(" ") + 1 , input.length());   
            //will break out of the loop on the last word/name
        }
        //input will now contain last name
        output += " " + input + ".";
        System.out.println("Initials: " + output);
    }
    
}
