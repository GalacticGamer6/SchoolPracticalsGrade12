/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Neeraavr
 */
public class String2Dates {

    public static void main(String[] args) {

        String date = "4 July 2208";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate date2 = LocalDate.parse(date, formatter2);
        System.out.println(date2);

    }

}
