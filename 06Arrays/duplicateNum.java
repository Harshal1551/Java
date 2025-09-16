public class duplicateNum {

    public static boolean duplicate(int nums[]){
        for(int i=0; i<nums.length-1 ; i++) { 
            for(int j=i+1; j<nums.length ; j++ ) { 
                if( nums[i] == nums[j] ) { 
                    return true ; 
                } 
            } 
        } return false; 
    }
    
    public static void main(String[] args) {
        int nums[] ={1, 2, 4, 6, 2};

        boolean duplicate = duplicate(nums);

        if(duplicate){
            System.out.println("Yes duplicate no. is present ");
        } else {
            System.out.println("No duplicate no. is present");
        }
    }
}
