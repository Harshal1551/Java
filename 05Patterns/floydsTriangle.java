import java.util.Scanner;

public class floydsTriangle {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the no. of rows: ");
         int r= sc.nextInt();
         floyd(r);
         
        }

        public static void floyd(int r){
            int counter = 1;

            for(int i=1; i<=r; i++){

                for (int j=1; j<=i; j++) {
                    System.out.print(counter+ " ");
                    counter++;
                }
                System.out.println();

            }
        }

}
