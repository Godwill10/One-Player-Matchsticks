
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class OnePlayer_Matchsticks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num_matchsticks = 21;
        
        System.out.println("Welcome! Please enter your name: ");
        String name = scan.next();
        
        while (true){
            System.out.println("There are "+num_matchsticks+" sticks available");
            System.out.println(name + ", pick 1 or 2 or 3 or 4 matches:");
            int num_picked = scan.nextInt(); 
            
            if(num_picked >4 || num_picked<1){
                System.out.println("Your pick was out of the range.");
                System.out.println();            
                continue;
            }
            num_matchsticks = num_matchsticks- num_picked;
            System.out.println("There are "+num_matchsticks+" sticks available");
            if(num_matchsticks == 1){
               System.out.println("There are "+num_matchsticks+" sticks available");
               System.out.println("Congratulations, " + name+ ". You won the game!");
               break;
            }            
            int computer_num = rand.nextInt(4)+1;
            System.out.println("The computer picked: "+ computer_num);
            System.out.println();            
            
            if (num_matchsticks<= 4){
                computer_num = num_matchsticks - 1;
            }
            
            num_matchsticks = num_matchsticks- computer_num;
            
            if (num_matchsticks == 1){
               System.out.println("Sorry, " + name+". You lost the game!");
               break;
            }
        }
    }
    
}
