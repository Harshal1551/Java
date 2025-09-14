import java.util.*;

public class basic {
   public static void main(String[] args) {
     // create 
    
     int marks[] = new int[3];

     int num[] = {1,2,3};

     String fruits[]= {"apple", "mango", "orange"};

    // Input and Output

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks as Phy Chem Math: ");
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    System.out.println("Phy: "+ marks[0]);
    System.out.println("Chem: "+ marks[1]);
    System.out.println("Math: "+ marks[2]);

    // Update 
    marks[2] = marks[2]+2;
    System.out.println("Updated Math: "+ marks[2]);

    int percent = (marks[0] + marks[1] + marks[2]) / 3;
    System.out.print("Percentage = " + percent+ "%");
   
     System.out.println();

    System.out.println("Updated Marks: ");
    update(marks);
     
    for(int i=0; i<marks.length; i++){
        System.out.print(marks[i]+ " ");
    }
    System.out.println();

   }

   public static void update(int marks[]){
     for(int i=0; i<marks.length; i++){
        marks[i]= marks[i]+1;
     }

   }
}
