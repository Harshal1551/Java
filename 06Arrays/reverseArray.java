
import java.util.Scanner;

 
public class reverseArray {


    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println("Array elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        reverseArray(arr);

        System.out.println("Reversed Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }


         
    }
}
