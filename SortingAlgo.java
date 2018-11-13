//Sorting Algorithm Selection Sort
//Activity 9
package selectionsort;

import java.util.Scanner;
public class SortingAlgo {


    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number of indexes:");
     int x = sc.nextInt();
     int[] arr = new int[x];
     System.out.println("Enter values:");
     for(int i = 0; i<arr.length; i++){
     arr[i] = sc.nextInt();
     }
     System.out.println("\n\n\n");
     System.out.print("Unsorted array: ");
     for(int k = 0; k < arr.length; k++){
     System.out.print(arr[k]+", ");
     }
     SelectionSort(arr);
     display(arr);
    }
    public static int[]SelectionSort(int[] Sort){
        int i,j,MinIndex, temp = 0;
        for (i = 0; i<Sort.length; i++){
            MinIndex = i;
            for(j = i; j<Sort.length; j++){
                if(Sort[j]<Sort[MinIndex]){
                    MinIndex = j;
                }
            }
            temp = Sort[MinIndex];
            Sort[MinIndex]=Sort[i];
            Sort[i]=temp;
        }
        return Sort;
    }
    public static void display(int[] Sort){
        
        System.out.print("\nSorted array: ");
        for (int i = 0 ; i<Sort.length; i++){
            System.out.print(Sort[i]+", ");
        }
    }
}
