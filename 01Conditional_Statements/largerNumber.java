import java.util.Scanner;

public class largerNumber {
      public static void main(String[] args) {
          
      Scanner sc = new Scanner (System.in);

      System.out.print("Enter the value of A: ");
      int A = sc.nextInt();
      
      System.out.print("Enter the value of B: ");
      int B = sc.nextInt();
      
      if (A>B) {
        System.out.println("A is greater than B");
      } else {
        System.out.println("B is greater than A");
      }


      }

}
