//Activity#6
package multidimentionalarray;
import java.util.Scanner;
public class Userinput2d {

    public static void main(String[] args) {
        
        /*String[][] murica = {{"Donald", "Trump","America numba 1"},
                            {"Make","America", "Great "},
                            {"Billions","and billions","And more billions"}};
        for(int i=0;i<murica.length;i++){
            for(int j=0;j<murica[i].length;j++){
                System.out.println(murica[i][j]);
            }
        }*/
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of rows: ");
         int x = sc.nextInt();
         System.out.println("Enter number of indexes: ");
         int y = sc.nextInt();
         int[][] a = new int[x][y];
        
        
        for(int i = 0; i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                int o = i+1;
                 System.out.println("Enter element for row"+o+"\t"+"index"+j+":");
                  a[i][j]= sc.nextInt();
            }
        }
        System.out.println("You entered:\n");
        for(int m = 0; m<a.length;m++){
            for(int n = 0;n<a[m].length;n++){
                int p = m+1;
        System.out.println("row"+p+"\t"+"index"+n+": "+a[m][n]);
        }
        }
}
}

