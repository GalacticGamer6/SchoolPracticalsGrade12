package P2_2020_Final;

import java.io.FileNotFoundException;

public class CounsellingUI {

    public static void main(String[] args) throws FileNotFoundException {

        SlotManager sm = new SlotManager();
        System.out.println(sm.displayAllClients());

    }

}
