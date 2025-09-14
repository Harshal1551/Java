import java.util.*;
public class checkMult10 {

    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         do { 
             System.out.print("Enter a number: ");
             int n = sc.nextInt();
             if(n % 10 == 0) {
                System.out.println("Number is multiple of 10");
                break;
             }
         } while (true);

    }
}
