
import java.util.Scanner;

public class skipMult10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
      do {
          System.out.print("Enter a number: ");
          int num = sc.nextInt();
          if(num%10==0){
            continue;
          }
          System.out.println("Number is: "+ num);

          
      } while (true);

    }
}
