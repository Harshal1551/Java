
import java.util.Scanner;

public class product {


    public static int multiply(int a, int b) {
        int product = a*b;
        return product;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int a= sc.nextInt();
        System.out.print("Enter 2nd no.: ");
        int b= sc.nextInt();
        int prod =  multiply(a, b);
        System.out.println(  "Product is: " +prod);
    }
}
