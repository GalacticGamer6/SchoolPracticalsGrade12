
package Objects_Classess;

import javax.swing.JOptionPane;

public class Use_Line {
    
    public static void main(String[] args) {
        
        Line stripe = new Line();
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter a size"));
        
        stripe.draw();
        size = Integer.parseInt(JOptionPane.showInputDialog("Enter a size"));
        stripe.size = size;
        stripe.draw();
        stripe.pattern = '&';
        stripe.draw();
        
        size = Integer.parseInt(JOptionPane.showInputDialog("Enter a size"));
        stripe.size = size;
        stripe.pattern = '=';
        stripe.draw();
        
        stripe.pattern = '*';
        
        for(int i = 5 ; i > 0;i--){
            stripe.size = i;
            stripe.draw();
            
        }
        
    }
    
}
