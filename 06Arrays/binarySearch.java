
import java.util.Scanner;

public class binarySearch {
    
    public static int binSearch(int arr[], int key){
        int start = 0 , end = arr.length-1;

        while(start <= end){
            int mid = (start + end) /2;

            if(arr[mid] == key){
                return mid;
            }
            else if (arr[mid]<key) {
                    start = mid+1;                
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static int recursiveBinSearch(int arr[], int key, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            return mid;
        }
        else if (arr[mid] < key) {
            return recursiveBinSearch(arr, key, mid + 1, end);
        }
        else {
            return recursiveBinSearch(arr, key, start, mid - 1);
        }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.println("Enter a key for find: ");
        int key = sc.nextInt();

        int result1 = binSearch(arr, key);

        if (result1 != -1) {
            System.out.println("Element found at index: " + result1);
        } else {
            System.out.println("Element not found"); 
        }

        int result2 = recursiveBinSearch(arr, key, 0, arr.length - 1);

        if (result2 != -1) {
            System.out.println("Recursive: Element found at index: " + result2);
        } else {
            System.out.println("Recursive: Element not found");
        }

        
    }
}
