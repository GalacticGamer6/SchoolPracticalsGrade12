package Objects_Classess;

public class C_Shape {
   
    public static void main(String[] args) {
        
        
        Line l = new Line();
        
        l.size = 10;
        l.pattern = '&';
        l.draw();
        
        l.size = 2;
        l.pattern = '^';
        
        for(int i = 0 ; i < 4;i++){
            l.draw();
        }
        
        l.size = 10;
        l.pattern = '&';
        l.draw();        
        
    }
    
    
    
}
