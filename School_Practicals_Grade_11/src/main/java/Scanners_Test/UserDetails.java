package Scanners_Test;

import javax.swing.*;
import java.util.Scanner;

public class UserDetails {

    public static void main(String[] args) {

        String user_info = JOptionPane.showInputDialog("Enter your name,surname and age(seperated by spaces)");
        Scanner info_scanner = new Scanner(user_info);

        String name = info_scanner.next();
        String surname = info_scanner.next();
        int age = info_scanner.nextInt();

        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age);

    }

}
