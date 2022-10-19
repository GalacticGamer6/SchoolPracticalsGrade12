package Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Student {

    private static String name;
    private static String surname;
    private static LocalDate date;
    
    
    public Student(String n, String sn, LocalDate d){
        
        name = n;
        surname = sn;
        date = d;
        
        
    }
    
    public String toString(){
        
        DateTimeFormatter output_formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted_date = date.format(output_formatter);
        return name + " " + surname + " " + formatted_date;
        
    }
    
    
}
