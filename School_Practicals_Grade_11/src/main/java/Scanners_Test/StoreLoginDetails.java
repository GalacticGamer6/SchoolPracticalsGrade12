package Scanners_Test;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Permission;

public class StoreLoginDetails {

    public static void main(String[] args) {

        String file_path = "C:\\Users\\Neeraav Ranjit\\IdeaProjects\\School_practicals_Gr11\\data\\loginDetails.txt";
        File details = new File(file_path);

        try {

            FileWriter fw = new FileWriter(details);


            String name = JOptionPane.showInputDialog("Enter a Name(TYPE STOP TO END)");


            int logins_processed = 0;

                while(!(name.equals("STOP"))){

                    String password = JOptionPane.showInputDialog("Enter a password");

                    PrintWriter pw = new PrintWriter(fw);

                    pw.print(name);
                    pw.print("#");
                    pw.println(password);

                    logins_processed++;

                    pw.close();

                    name = JOptionPane.showInputDialog("Enter a Name(TYPE STOP TO END)");
                }

            fw.close();


            } catch (IOException e) {
            System.out.println("File not found");
        }

    }

}
