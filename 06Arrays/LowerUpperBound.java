
import java.util.Scanner;

public class LowerUpperBound {

    public static int lowerBound(int arr[], int key){

        int start = 0, end = arr.length-1;
        int result = arr.length;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] >= key){
                result = mid;
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return result;
    }

    public static int upperBound(int arr[], int key){
        int start = 0, end = arr.length-1;
        int result = arr.length;

        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] > key){
                result = mid;
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter sorted elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\nSorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("Enter Key: ");
        int key = sc.nextInt();

        int lb = lowerBound(arr, key);
        int ub = upperBound(arr, key);

        System.out.println("Lower Bound: "+ lb);
        System.out.println("Upper Bound: "+ ub);
        

    }
}
