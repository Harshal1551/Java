
import java.util.Scanner;



public class invertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tne no. of lines: ");
        int n = sc.nextInt();

        for(int line=1; line<=n ; line++){
           for (int star=1; star<=(n-line+1); star++) {
               System.out.print("*");
           }
           System.out.println();
        }
    }
}   

