
import java.util.Scanner;

public class numPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int line=1; line<=num; line++){

            for (int s = 1; s <= num - line; s++) {
                System.out.print("  "); 
            }

            for (int i=1; i<=line; i++) {
                System.out.print(line+ "   ");
                
            }
            System.out.println();
        }

    }
}
