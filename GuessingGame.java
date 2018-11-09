/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing.game;
import java.util.Scanner;
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner logger = new Scanner(System.in);
 
   int a ;
   int guess = 0;
   int input;
  
   System.out.println("Enter a number:");
   a = logger.nextInt();
   System.out.println("\n\n\n\n\n\n\n\n\n\n");
  
   System.out.println("Guess the number");
   
   while(guess != a){
       guess = logger.nextInt();
       
       if (guess < a){
           System.out.println("Higher!");
         if (a % 2 == 0){
         System.out.println("Hint:The number is even.");
         }
         else{
         System.out.println("Hint:The number is odd.");
         }
        
       }
       else if (guess > a){
           System.out.println("Lower!");
           if (a % 2 == 0){
         System.out.println("Hint:The number is even.");
         }
         else{
         System.out.println("Hint:The number is odd.");
         }
          
       }
       
   }
    
    }
    
}
