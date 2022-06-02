package Gr11_June_Prac_2018;

public class ISPUI {
    
    public static void main(String[] args) {
        
        ISPArray ar1 = new ISPArray();
        ar1.ArraytoString();
        
        System.out.println("Sorted Version: \n");
        ar1.Sort();
        ar1.ArraytoString();
        
        System.out.println(ar1.deleteInvalid());
        
    }
    
}
