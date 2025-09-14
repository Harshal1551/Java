
public class largestNum {
    
    public static int largest(int nums[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
              if(nums[i] > largest){
                largest = nums[i];
              }
              if(nums[i]<smallest){
                smallest = nums[i];
              }
        }
        System.out.println("Smallest value is: "+ smallest);
        return largest;

    }
    public static void main(String[] args) {
        int nums[]= {1,2,6,5,3};

        System.out.println("Largest value is: "+ largest(nums));
    }
}
