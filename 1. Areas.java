//activity 1
package areas;
import java.util.Scanner;
import java.lang.Math;
public class Areas {

  
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter Circle's radius:");
       double a = sc.nextDouble();
       double area1 = (Math.PI * Math.pow(a, 2));
       System.out.println(area1);
       
       System.out.print("Enter Square's side length:");
       double b = sc.nextDouble();
       double area2 = Math.pow(b,2);
       System.out.println(area2);
       
       System.out.print("Enter triangle's Height:");
       double c = sc.nextDouble();
       System.out.print("Enter triangle's Base:");
       double d = sc.nextDouble();
       
       double area3 = (c*d)/2;
       System.out.println(area3);
    }
    
}
