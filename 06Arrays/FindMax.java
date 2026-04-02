
import java.util.Scanner;

public class FindMax {
    

    public static int maxNum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Maximum element is: "+ maxNum(arr));


    }
}
