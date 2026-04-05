
import java.util.Scanner;


public class selectionSort {


    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println("Original Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        selection(arr);

        System.out.println("Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
