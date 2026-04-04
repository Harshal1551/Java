
import java.util.Scanner;

public class OptimizedBubbleSort {

    public static void bubble(int arr[] ) {
        for(int i=0; i<arr.length-1; i++){
            boolean swap = false;
             for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            } 
            if(swap == false){
                break;
            }
        }      
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        bubble(arr);


        System.out.println("Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
