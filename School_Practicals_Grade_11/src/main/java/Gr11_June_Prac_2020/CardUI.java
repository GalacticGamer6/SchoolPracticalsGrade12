package Gr11_June_Prac_2020;

public class CardUI {

    public static void main(String[] args) {
        
        CardArray ra = new CardArray();
        ra.ArrayToString();
        
        ra.Sort();
        System.out.println("\n");
        ra.ArrayToString();
        
        System.out.println(ra.playCards("Finn", "Kylo Ren"));
        
    }
    
}
