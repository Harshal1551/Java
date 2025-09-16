public class rotatedSortedArray {
    
    public static int rotSorArr(int nums[], int tar){
      int st = 0, end = nums.length-1;

      while(st <= end){
        int mid = st + (end - st)/2;
        if (nums[mid] == tar){
            return mid;
        }

        if (nums[st] <= nums[mid]) {  // left sorted
            if (nums[st]<=tar && tar<=nums[mid]) {
                end = mid-1;
            } else{
                st = mid+1;
            }

        } else {   // right sorted 
            if (nums[mid]<=tar && tar<=nums[end]) {
                st = mid+1;
            } else{
                end = mid-1;
            }
        }
      }
      return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 5;

       int index = rotSorArr(nums, tar);

        if (index != -1) {
            System.out.println("The target found at index " + index);
        } else {
            System.out.println("Target not found");
        }
        
    }
}
