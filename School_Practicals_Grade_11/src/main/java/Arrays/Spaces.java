/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Neeraavr
 */
public class Spaces {
    
    public static void main(String[] args) {
        
        int num_array [] = {4,5,8,9,9};
        int total = 0;
        for(int i = 0; i < num_array.length;i++){
            
            total += num_array[i];
        }
        
        System.out.println("AVG: " + total/num_array.length);
    }
    
}
