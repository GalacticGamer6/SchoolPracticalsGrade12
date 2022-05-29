package Scanners_Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExtractDomain {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Neeraav Ranjit\\IdeaProjects\\School_practicals_Gr11\\data\\websites.txt");

        try {
            Scanner line_sc = new Scanner(file);

            int domain_num = 1;

            while(line_sc.hasNext()){
                String current_domain = line_sc.next();
                String formatted_domain = current_domain.substring(current_domain.indexOf(".") + 1,current_domain.lastIndexOf("."));
                System.out.println("Domain: " + domain_num + " " + formatted_domain);

                domain_num++;

            }

            System.out.println("Websites Processed: " + (domain_num - 1));

        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
    }

}
