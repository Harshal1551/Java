import java.util.Scanner;

public class decToBin {
    public static void decToBin(int num){
        int decNum = num;
       int pow = 0;
       int binNum = 0;

       while (num>0) { 
           int rem = num%2;
           binNum = binNum + (int)(rem * Math.pow(10, pow));

           pow++;
           num = num/2;
       }
       System.out.println("Binary of "+ decNum + " = "+ binNum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decNum = sc.nextInt();
        decToBin(decNum);
    }
}
