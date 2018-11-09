//Activity #7
package methods;
import java.util.Scanner;

public class Fibonnaci {
   
    public static int fs(int n){
        if(n==0)
            return 0;
        else if(n<=1)
            return 1;
        int x = fs(n-1)+ fs(n-2);
        return x;
    }
    public static int in(){
        System.out.println("Enter fibonacci sequence 'n':");
        Scanner log = new Scanner(System.in);
        int x = log.nextInt();
        return x;
    }
    public static void display(){
        int x = in();
         System.out.println("---------------------------------");
        for(int a = 0; a<= x; a++){
       System.out.print("f("+ a+ ")\t");}
       
        for(int j = 0; j<=x; j++){
             System.out.println("\n");
        for(int i =0; i<=j; i++){
             int y = fs(i);
            System.out.print(y+ "\t");
        }  
    }
    }
      public static void main(String[] args) {
    display();
    }
}
