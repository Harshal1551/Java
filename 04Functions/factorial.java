
import java.util.Scanner;

public class factorial {

    public static int factorial(int n) {
        int fact = 1;
        
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }

        return fact; 
    }


    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/(fact_r*fact_nmr);

         return binCoeff; 
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no.: ");
        // int n = sc.nextInt();
        // int fact = factorial(n);
        // System.out.println("Factorial of "+ n + " is " + fact);

        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the r: ");
        int r = sc.nextInt();

        System.out.println( "Binomial Coefficient = " +binCoeff(n,r));
    }
}
