package P1_2022_Final;

import java.time.LocalDate;


public class Officer extends CrewMember{
    
    private int rank;
    private LocalDate date_promoted;
    public static int num_promoted_officers = 0;

    public Officer(String INfullname, int INcrewID, String INdepartment,int rank, LocalDate date_promoted ) {
        super(INfullname, INcrewID, INdepartment);
        this.rank = rank;
        this.date_promoted = date_promoted;
    }

    public int getRank() {
        return rank;
    }

    public String getTitle(){
        
        String title = "";
        
        switch(rank){
            
            case 1: title = "Ensign";
                    break;
            case 2: title = "Lieutenant";
                    break;
            case 3: title = "Lt Commander";
                    break;
            case 4: title = "Commander";
                    break;
            case 5: title = "Captain";
                    break;                    
            
        }
        
        return title;
    }
    
    @Override
    public String toString(){
        
        return super.toString() + " " + getTitle();
        
    }
    
    public void Promote(){
        
        if(rank < 4){
            rank++;
            date_promoted = LocalDate.now();
        }
        
    }
    
}
