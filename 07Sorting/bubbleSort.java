

public class bubbleSort {
    
    public static void bubble(int arr[]){
         for (int turn=0; turn<arr.length-1; turn++) {
             int swaps = 0;
             for (int j=0; j<arr.length-1-turn; j++) {
             
                if(arr[j] > arr[j+1]) {
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1]= temp;
                    swaps++;
                }
             }
            System.out.println("Pass " + (turn+1) + " -> No. of swaps: " + swaps);
            if (swaps == 0) {
                System.out.println("Array is already sorted. Exiting early...");
                break;
            }
         }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       int arr1[] = {5,4,1,3,2};   
        int arr2[] = {1,2,3,4,5};  
        
        System.out.println("Case 1: Unsorted array");
        bubble(arr1);
        printArr(arr1);

        System.out.println("\nCase 2: Already sorted array");
        bubble(arr2);
        printArr(arr2);
    }
}
