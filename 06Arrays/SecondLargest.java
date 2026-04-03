
import java.util.Scanner;

public class SecondLargest {

    public static int findSecondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
    
           if(arr[i] > largest){
               second = largest;
               largest = arr[i];
           }
           else if(arr[i] > second && arr[i] != largest){
               second = arr[i];
           }
       }
       return second;
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

        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int result = findSecondLargest(arr);

        if(result == Integer.MIN_VALUE){
            System.out.println("No second largest element");
        } else{
            System.out.println("Second largest element is: "+ result);
        }



    }
}
