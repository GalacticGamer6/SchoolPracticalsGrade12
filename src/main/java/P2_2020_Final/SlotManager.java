package P2_2020_Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SlotManager {

    private Client [] clients = new Client[20];
    private TimeSlot [] timeSlots = new TimeSlot[40];

    public SlotManager() throws FileNotFoundException {

        String clients_file_path = "data//clients.txt";
        Scanner clients_scanner = new Scanner(new File(clients_file_path));

        for(int i = 0; i < 20; i++){

            String client_name = clients_scanner.nextLine();
            String preffered_counsellor = clients_scanner.nextLine();
            int preffered_time = Integer.parseInt(clients_scanner.nextLine());

            Client c = new Client(client_name,preffered_counsellor,preffered_time);
            clients[i] = c;
        }

        clients_scanner.close();

    }

    public String displayAllClients(){
        String output = "";
        output +="All clients: " + "\n";

        for(int i = 0; i < clients.length - 1 ;i++){
         output += clients[i].toString() + "\n";
        }
        return output;
    }

    public void generateTimeSlots() throws FileNotFoundException {
        String file_path = "data//counsellors.txt";

        Scanner counsellors_scanner = new Scanner(new File(file_path)).useDelimiter(",");

        while(counsellors_scanner.hasNext()){
            int counter = 0;
            String current_counsellor = counsellors_scanner.next();

            for(int i = 8; i < 17; i++){
                while(i != 12) {
                    TimeSlot ts = new TimeSlot(current_counsellor, i);
                    timeSlots[counter] = ts;
                }
            }

        }
    }
}
