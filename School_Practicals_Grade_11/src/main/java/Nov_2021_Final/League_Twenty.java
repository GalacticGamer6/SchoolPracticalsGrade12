/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov_2021_Final;

import javax.swing.JOptionPane;

/**
 *
 * @author Neeraav Ranjit
 */
public class League_Twenty {
    
    public static double highest_AVG = 0.0;
    public static String highest_AVG_Name = "";
    public static String MVPs = "";
    public static int num_MVP = 0;
    public static String current_Player_Name = "";
    public static double current_Player_Average = 0.0;
    public static int current_Player_Fifties = 0;
    
    public static void main(String[] args) {
        
        int players_Entered = 0;
        //first input to get into loop
        current_Player_Name = JOptionPane.showInputDialog("Enter a player name");
        
        //player header
        System.out.println("=========================");
        System.out.println("PLAYER STATS");
        System.out.println("=========================");
        
        while(!(current_Player_Name.equalsIgnoreCase("XXX"))){
            
            System.out.println("NAME: " + current_Player_Name);
            generate_Player();
            
            System.out.println("");
            System.out.println("");
            
            
            players_Entered++;
            
            
            
            //updating the variable/ asking for next name
            current_Player_Name = JOptionPane.showInputDialog("Enter a player name");

        }
        
        System.out.println("=========================");
        System.out.println("TEAM STATS");
        System.out.println("=========================");
        
        System.out.println("MVP COUNT: " + num_MVP);
        System.out.println("MVP NAMES: " + MVPs);
        System.out.println("MVP WINNER: " + highest_AVG_Name);
        System.out.println("MVP AVG: " + highest_AVG);
    }
    
    
    
    public static void generate_Player(){
        
        boolean mvp_Nominee = false;
        
        int player_Experience = (int)(Math.random()*(3)) + 1;
        String experience_Label = "";
        
        switch(player_Experience){
            
            case 1: experience_Label = "junior";
                    break;
            case 2: experience_Label = "senior";
                    break;
            case 3: experience_Label = "expert";
                    break;
        }
        
        System.out.println("EXP: " + experience_Label);
        
        //sorting out player code stuff
        
        String player_Code = generate_Player_Code();
        //printing and making code uppercase
        System.out.println("CODE: " + player_Code.toUpperCase());
        
        
        //score range calculations + average score calculations
        
        int max_Score = player_Experience * 50;
        int total_Score = 0;
        
        for(int games_Played = 1 ; games_Played <= 5 ; games_Played++){
            
            int score = 0;
            score += (int)(Math.random()* max_Score + 1);
            total_Score += score;
            
//            System.out.println("game " + games_Played + ": " + score);
//            Debug stuff

            if(score > 50){
                current_Player_Fifties++;
            }
        }
        
        
        current_Player_Average = total_Score/5.0;
        System.out.println("AVG: " + current_Player_Average);
        
        if(current_Player_Average > highest_AVG){
            highest_AVG = current_Player_Average;
            highest_AVG_Name = current_Player_Name;
        }
        
        //MVP tings
        if(current_Player_Fifties > 3){
            mvp_Nominee = true;
            num_MVP++;
            MVPs += " " + current_Player_Name;
            
            System.out.println("NOM: " + mvp_Nominee);
        }
        else{
            System.out.println("NOM: " + mvp_Nominee);
        }
        
        
        
        
        
    }
    
    
    public static String generate_Player_Code(){
        
        String player_Code = "";
        
        //getting the first 3 letters of name
        for(int i = 0 ; i < 3 ; i++){
            player_Code += current_Player_Name.charAt(i);
        }
        
        //getting length of String
        int num_Letters = current_Player_Name.length();
        
        //finishing up
        player_Code += num_Letters;
        return player_Code;
    }
}
