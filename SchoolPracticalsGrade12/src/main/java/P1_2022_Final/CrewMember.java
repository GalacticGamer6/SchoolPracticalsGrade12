package P1_2022_Final;

public class CrewMember {
    
    private String fullname;
    private int crewID;
    private String departmnent;
    public static int num_promoted_crew = 0;
    
    public CrewMember(String INfullname, int INcrewID, String INdepartment){
        
        fullname = INfullname;
        crewID = INcrewID;
        departmnent = INdepartment;
        
    }

    public String getFullname() {
        return fullname;
    }

    public int getCrewID() {
        return crewID;
    }

    public String getDepartmnent() {
        return departmnent;
    }
    
    public String toString(){
        
        return fullname + "\t" + "Crew ID: " + crewID + "\t" + "[" + departmnent + "]";
        
    }
    
    
}
