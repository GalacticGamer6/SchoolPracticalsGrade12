package P2_2020_Final;

public class Client {

    public String client_name;
    public String preffered_counsellor;
    public int earliest_hour;

    public Client(String inCN,String inPCS,int inEh){

        client_name = inCN;
        preffered_counsellor = inPCS;

        if(inEh > 16){
            earliest_hour = 16;
        }
        else {
            earliest_hour = inEh;
        }

    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getPreffered_counsellor() {
        return preffered_counsellor;
    }

    public void setPreffered_counsellor(String preffered_counsellor) {
        this.preffered_counsellor = preffered_counsellor;
    }

    public int getEarliest_hour() {
        return earliest_hour;
    }

    public void setEarliest_hour(int earliest_hour) {
        this.earliest_hour = earliest_hour;
    }

    @Override
    public String toString() {
        return (this.client_name + "\t" + this.preffered_counsellor + "\tEarliest " + this.earliest_hour + ":00");
    }
}
