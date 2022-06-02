package Gr11_June_Prac_2020;

public class Card {
    
    private String name;
    private String type;
    private int basic;
    private int special;
    private int leader;
    private int unique;
    
    final static int LIGHTFACTOR = 3;
    final static double DARKFACTOR = 2.5;
    
    public Card(String n, String t, int b, int s, int l, int u){
        
        name = n;
        type = t;
        basic = b;
        special = s;
        leader = l;
        unique = u;
        
        
    }
    
    public String getName(){
        return name;
    }
    
    public boolean checkLight(){
        if(type.contains("Light")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double calcPoints(){
        if(checkLight()){
            return (basic + special + leader + unique) * LIGHTFACTOR;
        }
        else{
            return (basic + special + leader + unique) * DARKFACTOR;
        }
    }
    
    public String getNameTypePoints(){
        return getName() + ": " + calcPoints();
    }
    
    public String toString(){
        
        if(checkLight()){
            return(name + "\t" + type + "\t" + basic + " " + special + " " + leader + " " + unique + " " + LIGHTFACTOR);
        }
        else{
            return(name + "\t" + type + "\t" + basic + " " + special + " " + leader + " " + unique + " " + DARKFACTOR);
        }
        
        
    }
}
