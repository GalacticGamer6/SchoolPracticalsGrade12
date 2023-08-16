/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trial_2022;

import java.time.LocalDate;
import java.time.Month;
import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author Neeraav Ranjit
 */
public class StudentUI {
    
    public static void main(String[] args) {
        
        LocalDate dob = LocalDate.of(2005, 06, 07);
        Student s = new Student("Geoffrey Leigh Palmers", dob);
        
        System.out.println(s.toString());
        
    }
    
}
