/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Past_Papers_Gr11.term_1;

import javax.swing.JOptionPane;

/**
 *
 * @author neeraavr
 */
public class Word_Games {

    public static void main(String[] args) {
       //cause we wanna start the lopp
       
        int current_Points = 1;
       String  input = JOptionPane.showInputDialog("Ejter our  frst woirkd");
        String current_Word ="";
        int total_Points = 0;
        
        while(current_Points == 1){
                
            current_Word = JOptionPane.showInputDialog("Enter your word");
            
            if(current_Word.charAt(0) == input.charAt(input.length() -1 )){
                total_Points++;
                current_Points = 1;
                
                input = current_Word;
                
                current_Word = JOptionPane.showInputDialog("Ejter our  frst woirkd");
            }
            else{
                
                current_Points = 0;
                        
            }
            
            
        }
        
        
        System.out.println("Total POints: " + total_Points);
    }
    
}
