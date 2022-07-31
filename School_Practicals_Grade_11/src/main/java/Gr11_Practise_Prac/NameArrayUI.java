package Gr11_Practise_Prac;

/**
 *
 * @author Neeraav Ranjit
 */
public class NameArrayUI {
    
    public static void main(String[] args) {
        
        NamesArray peeps = new NamesArray();
        
        System.out.println("Original Array");
        System.out.println(peeps.toString());
        
        System.out.println("Sorted Array");
        peeps.sort();
        System.out.println(peeps.toString());
        
        System.out.println("Removing Callie");
        peeps.delete("Callie");
        System.out.println(peeps.toString());
        
        System.out.println("Added Carrie");
        peeps.insert("Carrie");
        System.out.println(peeps.toString());
        
        
    }
    
}
