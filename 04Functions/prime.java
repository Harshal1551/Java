
import java.util.Scanner;

public class prime {
    
    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i==0){
    //             isPrime = false;
    //             System.out.println(n+ " is not prime number");
    //             break;
    //         }
    //         System.out.println(n+ " is prime number");
    //         break;
    //     }

    //     return isPrime;
    // }


    
         //Optimized solution

     public static void isPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }
        if (n == 2) {
            System.out.println(n + " is a prime number");
            return;
        }

        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        //System.out.println(isPrime(n));
        isPrime(n);
    }
}
