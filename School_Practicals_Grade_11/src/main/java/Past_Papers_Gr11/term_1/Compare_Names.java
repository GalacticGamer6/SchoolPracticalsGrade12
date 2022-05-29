package Past_Papers_Gr11.term_1;

import javax.swing.JOptionPane;

public class Compare_Names {
 
    
    public static void main(String[] args) {
    
        String input = "";
        String most_Alphabetical = "zzzzzzzzzzzzzzzzzzzzzzz";
        
        for(int i = 0 ; i < 5 ; i++){
            
            input = JOptionPane.showInputDialog("Etner a name");
            
            if(input.compareTo(most_Alphabetical) < 0){
                
                most_Alphabetical = input;
                
            }
        }
        
        System.out.println("Most Alphabetical: " + most_Alphabetical);
        
    }
    
    
}
