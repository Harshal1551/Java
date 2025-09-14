import java.util.*;

public class ifelse{
 public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
           System.out.print("Enter Your Age: ");
            int age = sc.nextInt();

           if (age>=18) {
               System.out.println("You are an adult");
           }
           if (age>13 && age<18) {
               System.out.println("You are teenager");
           }
           else{
            System.out.println("You are not an adult");
           }

        }   
}