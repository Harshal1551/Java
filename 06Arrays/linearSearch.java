
public class linearSearch {

    public static int linear_search(int key, int num[]) {
        for(int i=0; i<num.length; i++){
            if(num[i]==key){
               return i;
            } 
        }
           return -1;
    }

    public static void menu(String item, String menu[]){
        for(int i=0; i<menu.length; i++){
           if(menu[i]==item){
            System.out.println("Item found at "+ i+ " index");
           }
        }
    }
    
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16};
        String menu[] = {"Dosa", "Samosa", "Tea", "Coffee"};
        int key = 12;

        int index = linear_search(key, num);

        if (index==-1) {
            System.out.println("NOT found");
        } else {
            System.out.println("Key is found at index "+ index);
        }

        String item = "Tea";

        menu(item, menu);

        
    }
}
