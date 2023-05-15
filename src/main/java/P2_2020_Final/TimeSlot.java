package P2_2020_Final;

public class TimeSlot {

    public String counsellor;
    public int start_hour;
    public boolean  is_available;

    public TimeSlot(String inCS,int inSh){
        counsellor = inCS;
        start_hour = inSh;
        is_available = true;
    }

    public void setIsAvailable(boolean is_available) {
        this.is_available = is_available;
    }

    public String getCounsellorName() {
        return counsellor;
    }

    public int getStartHour() {
        return start_hour;
    }

    public boolean isIsAvailable() {
        return is_available;
    }

    private int getEndHour(){
        return start_hour + 1;
    }

    @Override
    public String toString() {
        return (this.counsellor + " " + this.start_hour + " - " + this.getEndHour());
    }
}
