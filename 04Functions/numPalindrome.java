
import java.util.Scanner;

public class numPalindrome {


    public static void isPalindrome(int num){
        int palindrome = num;
        int rev = 0;

        while(palindrome != 0){
            int rem = palindrome % 10 ;
            rev = rev * 10 + rem ;
            palindrome = palindrome / 10 ;
        }

        if (num == rev) {
            System.out.println("Number "+ num + " is a palindrome" );
        } else {
             System.out.println("Number "+ num + " is not a palindrome" );
        }

      return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        isPalindrome(num);
    }
}
