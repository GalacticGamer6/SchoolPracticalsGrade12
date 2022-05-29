package Gr11_June_Prac_2021;

import java.io.FileNotFoundException;

public class RatingArrayUI {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        RatingArray ratings = new RatingArray();
        
        ratings.sort();
        System.out.println("NUMBER SUMMARY");
        System.out.println("Lowest: " + ratings.getElement(0));
        System.out.println("Highest: " + ratings.getLast());
        System.out.println("Average: " + ratings.getAverage());
        
    }
    
}
