package Date_Time;

import java.time.LocalDate;
import java.time.Month;

public class DateTime {
    
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        LocalDate future_date = today.plusWeeks(3).plusDays(4);
        
        System.out.println(future_date);
        
        
        
        
//        LocalDate Birthdate = LocalDate.of(2005, Month.AUGUST, 28);
//        LocalDate kyra_birthdate = LocalDate.of(2005, Month.APRIL, 10);
//        
//        if(Birthdate.isBefore(kyra_birthdate)){
//            System.out.println("IM OLDER THAN KYRA");
//        }
//        else{
//            System.out.println("IM NOT ODER THAN CRAB");
//        }
//
//        
//        System.out.println(day);        
    }
    
}
