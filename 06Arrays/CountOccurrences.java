import java.util.Scanner;

public class CountOccurrences {

    
     public static int findFirst(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                result = mid;
                end = mid - 1;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static int findLast(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                result = mid;
                start = mid + 1;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        int first = findFirst(arr, key);
        int last = findLast(arr, key);

        if (first == -1) {
            System.out.println("Count = 0");
        } else {
            int count = last - first + 1;
            System.out.println("Count = " + count);
        }

        sc.close();
    }
}
