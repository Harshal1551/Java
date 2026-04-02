
import java.util.Scanner;

public class SearchElement {

    public static int findElement( int key, int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            } 
        }
        return -1;

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        System.out.println("Enter element to Find: ");
        int key = sc.nextInt();

        int result = findElement(key, arr);

        if(result != -1){
            System.out.println(key+ " found at index: " + result );
        } else{
            System.out.println(key+ "Not found in array");
        }

        sc.close();
    }
}
