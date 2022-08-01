/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gr11_Practise_Prac;

/**
 *
 * @author Neeraav Ranjit
 */
public class NamesArrayUI {
    
    public static void main(String[] args) {
        
        NamesArray n = new NamesArray();
        
        System.out.println("ORIGINAL ARRAY");
        System.out.println(n.toString());
        
        System.out.println("SORTED ARRAY");
        n.sort();
        System.out.println(n.toString());
        
        System.out.println("REMOVING CALLIE");
        n.delete("Callie");
        System.out.println(n.toString());
        
        System.out.println("ADDING CARRIE");
        n.insert("Carrie");
        System.out.println(n.toString());
    }
    
}
