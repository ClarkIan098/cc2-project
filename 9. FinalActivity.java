//Final Activity
package finalactivity;
import java.util.Scanner;
public class FinalActivity {

    public static void main(String[] args) {
       sub();
    }
    
    public static void sub (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose: Fibonacci or Factorial? ");
        String a = sc.nextLine();
        if (a.equalsIgnoreCase("Factorial")){
           display1();
        }else if (a.equalsIgnoreCase("Fibonacci")){
            display2();
        }else {
            System.out.print("Invalid input\n");
         sub();
        }
    }
    //start array input
    public static void in(String in){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number of indexes:");
     int x = sc.nextInt();
     int[] arr = new int[x];
     System.out.println("Enter values:");
     for(int i = 0; i<arr.length; i++){
     arr[i] = sc.nextInt();
     }
     System.out.println("\n\n\n");
     System.out.print("Entered array: ");
     for(int k = 0; k < arr.length; k++){
     System.out.print(arr[k]+", ");
     }
    }
    //end array input
    
    //start factorial
static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    

static void display1(){
     Scanner sc = new Scanner(System.in);
        int x = arrayin();
         int[] arr = new int[x];
         System.out.println("Enter elements:");
        for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
        }
       for(int a = 0; a< arr.length; a++){
       System.out.print("f("+ arr[a]+ ")\t");
        }
        int i,fact=1;  
        int number = arr[x] ;
        for(i=1;i<number;i++){   
        fact = factorial(arr[i]);
        System.out.println(fact + "\t");  

}
}
 //end factorial


//start fibionacci
  public static int fib(int n){
        if(n==0)
            return 0;
        else if(n<=1)
            return 1;
        int x = fib(n-1)+ fib(n-2);
        return x;
    }
    public static void display2(){
        Scanner sc = new Scanner(System.in);
        int x = arrayin();
         int[] arr = new int[x];
         System.out.println("Enter elements:");
        for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
        }
        
        for(int a = 0; a< arr.length; a++){
       System.out.print("f("+ arr[a]+ ")\t");
        }
         System.out.print("Sequence: \n");
        for(int j = 0; j<arr.length; j++){
            int k = fib(arr[j]);
            System.out.print(k + "\t");
        }
       
    }   
    //End fibonacci
    
    
    //start array input
    public static int arrayin(){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter size of array: ");
     int x = sc.nextInt();
     return x;
    }
    //end array input
}
