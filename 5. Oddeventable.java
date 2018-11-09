//Activity #5
package array;
import java.util.*;
public class Oddeventable {

   
    public static void main(String[] args) {
        /* int[] n = {20,9,18,15,4,65,2,23,14,3,};
                    
      System.out.println("Elements of Oddeventable\n"
                + "20,9,18,15,4,65,2,23,14,3");
        System.out.println("Even\tOdd");
        for(int i=0;i<n.length;i++){
        if(n[i]%2 == 0){
            System.out.print(n[i]);
            
        }else{
            System.out.println("\t"+ n[i]);
            
        }
    }
        System.out.print("\n");*/
        
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of indexes: ");
         int x = sc.nextInt();
         int[] n = new int[x];
       System.out.println("Enter arrays: ");
        for(int i=0;i<n.length;i++){    
        n[i] = sc.nextInt();
    }
       System.out.println("Elements of Array" + n);
        System.out.println("Even\tOdd");
        for(int i=0;i<n.length;i++){
        if(n[i]%2 == 0){
            System.out.print(n[i]+"\n");
        }else{
            System.out.println("\t"+ n[i]);
            
        }
    }
    }
    }
