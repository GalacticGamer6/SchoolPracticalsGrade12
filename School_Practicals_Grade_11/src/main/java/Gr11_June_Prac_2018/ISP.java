package Gr11_June_Prac_2018;

import java.util.Scanner;

public class ISP {
    
    private String ip;
    private int total;
    private String ISP;
    private String date;
    
    public ISP(String i , int t, String isp, String d){
        ip = i;
        total = t;
        ISP = isp;
        date = d;
        
        date = changeDate();
    }
    
    public String getIp(){
        return ip;
    }
    
    public void setIp(String new_ip){
        ip = new_ip;
    }
    
    public int getTotal(){
        return total;
    }
    
    public void setTotal(int new_total){
        total = new_total;
    }
    
    public String getISP(){
        return ISP;
    }
    
    public void setISP(String new_ISP){
        ISP = new_ISP;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setDate(String new_date){
        date = new_date;
    }
    
    public boolean validIP(){
        boolean is_Valid = false;
        
        Scanner sc = new Scanner(getIp()).useDelimiter(".");
        while(sc.hasNextInt()){
            if(sc.nextInt() > 255 || sc.nextInt() < 0){
                is_Valid = false;
                
            }
            else{
                is_Valid = true;
            }
        }
        return is_Valid;
    }
    
    private String changeDate(){
        String month_array [] = {"January" , "February" , "March", "April", "May" , "June" , "July", "August", "Sepetember", "October", "November", "December"};
        
        String year = "20" + date.substring(6);
        String month = month_array[Integer.parseInt(date.substring(3, 5)) - 1];
        String day = date.substring(0, 2);
        
        String output = year + " " + month + " " + day;
        return output;
    }
    
    public String toString(){
        return(ip + "\t" + ISP + "\t" + total + "\t" + date);
    }
}