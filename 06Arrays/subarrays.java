


public class subarrays {
    
    public static void printSubarrays(int numbers[]){
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0]; 
        
        // calculate prefix array 
          for(int i=1; i<prefix.length; i++){
               prefix[i] = prefix[i-1] + numbers[i];
             }

         for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                 
                // for(int k=start; k<=end; k++){
                //     System.out.print(numbers[k]+ " "); // print subarray
                //     sum += numbers[k];
                // }

                if(sum > maxSum){
                  maxSum = sum;
                }

                System.out.print("   sum of elements = " + sum);
                System.out.println();
                ts++;
            }
             System.out.println();
         }
         System.out.println("Total subarrays are: "+ ts);
         System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
         int numbers[] = {2, 4, 6, 8, 10};   

         printSubarrays(numbers);
    }
}
