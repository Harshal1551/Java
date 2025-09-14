
import java.util.Scanner;

public class optPrime {

    public static boolean isPrime(int n) {
        if (n<=1) return false;
        if (n==2) return true;
        if (n%2==0) return false;

        for (int i=3; i<=Math.sqrt(n); i+=2) {
            if (n%i==0) return false;
        }

        return true;
    }

    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        System.out.println("The prime numbers from 2 to " +n);
        primesInRange(n);
    }
}
