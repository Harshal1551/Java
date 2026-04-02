
import java.util.Scanner;

public class PrintElements {
    
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");   
        }

        sc.close();

    }
}
