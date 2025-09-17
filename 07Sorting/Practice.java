

public class Practice {
    
    public class SortingDescending {

    // -------------------- Bubble Sort --------------------
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] < arr[j + 1]) { // swap if smaller (for descending)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // -------------------- Selection Sort --------------------
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxPos]) { // pick the largest
                    maxPos = j;
                }
            }
            // swap
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }

    // -------------------- Insertion Sort --------------------
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // shift smaller elements to the right
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    // -------------------- Counting Sort --------------------
    public static void countingSort(int arr[]) {
        // 1. find largest
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // 2. make count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // 3. put back in descending order
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // -------------------- Helper function --------------------
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // -------------------- Main --------------------
    public static void main(String[] args) {
        int arr1[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int arr2[] = arr1.clone();
        int arr3[] = arr1.clone();
        int arr4[] = arr1.clone();

        System.out.println("Original Array:");
        printArr(arr1);

        bubbleSort(arr1);
        System.out.println("Bubble Sort (Descending):");
        printArr(arr1);

        selectionSort(arr2);
        System.out.println("Selection Sort (Descending):");
        printArr(arr2);

        insertionSort(arr3);
        System.out.println("Insertion Sort (Descending):");
        printArr(arr3);

        countingSort(arr4);
        System.out.println("Counting Sort (Descending):");
        printArr(arr4);
    }
}

}
