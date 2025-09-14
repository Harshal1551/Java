
import java.util.Scanner;

public class avgThreeNum {
    
    public static double average(int x, int y, int z){
        double avg = (x+y+z)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter a value of y: ");
        int y = sc.nextInt();
        System.out.print("Enter a value of z: ");
        int z = sc.nextInt();

       double avg = average(x, y, z);
        System.out.println("Average of x , y & z is = "+ avg);
        
    }
}
