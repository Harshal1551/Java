
import java.util.Scanner;

public class zeroOneTriangle {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int r = sc.nextInt();

        triangle(r);
    }

    public static void triangle(int r){
           for (int i=1; i<=r; i++) {

               for (int j=1; j<=i; j++) {

                   if((i+j)%2==0){
                    System.out.print("1 ");
                   } else {
                    System.out.print("0 ");
                   }
               }
               System.out.println();
           }
    }
}
