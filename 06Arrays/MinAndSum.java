
import java.util.Scanner;

public class MinAndSum {


    public static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }

        return min;
    }

    public static long sumOfElements(int arr[]){
        long sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+ arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println("Array elements: ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        System.out.println("Minimum element is: "+ findMin(arr));

        System.out.println("Sum of element is: "+ sumOfElements(arr));


    }
}
