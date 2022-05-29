/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects_Classess;


public class Client {
    
    private String client_name;
    private String account_number;
    private  double balance;
    
    public Client(String in_name , String in_acc_number, double in_balance){
        
        client_name = in_name;
        account_number = in_acc_number;
        balance = in_balance;
        
    }
    
    public String get_client_name(){
        return client_name;
    }
    
    public String get_account_number(){   
        return account_number;
    }
    
    public double get_balance(){
        return balance;
    }
    
    public String set_client_name(String new_client_name){
        return new_client_name;
    }    
    
    public String set_account_number(String new_account_number){
        return new_account_number;
    }
    
    public String set_balance(String new_balance){
        return new_balance;
    }        
    
    public String change_name(){
        
        String client_name = get_client_name();
        
        String first_name = client_name.substring(0 , client_name.indexOf(" ") - 1);
        String surname = client_name.substring(client_name.lastIndexOf(" ") + 1 , client_name.length());
        
        String changed_name = surname  + first_name;
        
        return changed_name;
    }
    
    public static boolean check_account_number(String account_num){
        
        boolean is_valid = false;   //SET TO FALSE BY DEFAULT
        
        int second_num = (int)account_num.charAt(1);
        int third_num = (int)account_num.charAt(2);
        int fifth_num = (int)account_num.charAt(4);
        
        if((second_num + third_num)/ 10 == fifth_num){
            if(account_num.length() >= 6 & (int)account_num.charAt(0) == 0){
                is_valid = true;
            }
        }
        
        return is_valid;
    }
    
    public void display(){
        
        System.out.println("Account number: " + change_name());
        System.out.println("client Name: " + get_client_name());
        System.out.println("Account balance: " + get_balance());
        
    }
    
    
}
