package main;

import java.util.List;
import java.util.ArrayList;

public class Players {
    
    public List<String> players = new ArrayList<>();
    public static void main (String args[]){
        
        Players happi= new Players();
        
        happi.players.add("Player 1");        
        happi.players.add("Ramos");
        happi.players.add("Player 3");        
        happi.players.add("Player 4");
        happi.players.add("Player 5");
        happi.players.add("Player 6");
        happi.players.add("Player 7");
        happi.players.add("Player 8");
        happi.players.add("Messi");
        
        //removing
        happi.players.remove(5);
        happi.players.remove(7);
        
       //finding the index value
       int index =  happi.players.indexOf("Ramos");
       
       //update (set)
       happi.players.set( index , "Player 2");
       
       //contains or not (if statement)
       if(!happi.players.contains("Messi")){
                  System.out.println("Messi is there");
       }else{
           System.out.println("Messi is not there");
       }
       
       //printing the list of player from the even index loop
       int i;
       for(i=0; i<happi.players.size(); i++){
       } 
       
       
        
        

        



        

    }
    
}
