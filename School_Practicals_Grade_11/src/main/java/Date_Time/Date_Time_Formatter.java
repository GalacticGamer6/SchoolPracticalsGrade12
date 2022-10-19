
package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Date_Time_Formatter {
    
    public static void main(String[] args) {
        
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String text = date.format(formatter);
    System.out.println(text);
    
    LocalDate another_date = LocalDate.now();
    
    }
    
}
