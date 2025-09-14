import java.util.*;

public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Income: ");
          
        int income = sc.nextInt();
        int tax ;

        if (income<500000) {
            tax = 0*income;
            System.out.print("Tax on your income is 0% = " +tax);
        } 
        else if (income>=500000 && income<1000000) {
            tax = (int)(income* 0.2);
            System.out.print("Tax on your income is 20% = " +tax);
        }
        else{
            tax = (int)(income* 0.3);
            System.out.print("Tax on your income is 30% = " +tax);
        }
        
    }
}
