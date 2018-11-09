// activity 2
package javaapplication33;
import java.util.Scanner;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        String a;
        int num1;
        int num2;
        int num3;
        
        System.out.println("Choose operation:");
        a = sc.next();
        
        System.out.println("-------------------------");
        switch(a){
            
         case "addition":   
         case "+":
          System.out.println("Enter First Number");
          num1 = sc.nextInt();
          System.out.println("Enter Second Number");
          num2 = sc.nextInt();
          num3 = num1 + num2;
          System.out.println("-------------------------");
          System.out.println("The answer is "+ num3);
           break;
         
         case "subtraction":  
         case "-":   
          System.out.println("Enter First Number");
          num1 = sc.nextInt();
          System.out.println("Enter Second Number");
          num2 = sc.nextInt();
          num3 = num1 - num2;
          System.out.println("-------------------------");
          System.out.println("The answer is "+ num3);
           break;
         
         case "multiplication":  
         case "*":   
          System.out.println("Enter First Number");
          num1 = sc.nextInt();
          System.out.println("Enter Second Number");
          num2 = sc.nextInt();
          num3 = num1 * num2;
          System.out.println("-------------------------");
          System.out.println("The answer is "+ num3);
           break;
         
         case " divition":  
         case "/":   
          System.out.println("Enter First Number");
          num1 = sc.nextInt();
          System.out.println("Enter Second Number");
          num2 = sc.nextInt();
          num3 = num1 / num2;
          System.out.println("-------------------------");
          System.out.println("The answer is "+ num3);
           break; 
         
         case "modulation":  
         case "%":   
          System.out.println("Enter First Number");
          num1 = sc.nextInt();
          System.out.println("Enter Second Number");
          num2 = sc.nextInt();
          num3 = num1 % num2;
          System.out.println("-------------------------");
          System.out.println("The answer is "+ num3);
           break;  
         
         default:
             System.out.println("error");
    }  
    }
    
}
