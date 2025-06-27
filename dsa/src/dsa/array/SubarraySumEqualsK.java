package dsa.array;


public class SubarraySumEqualsK {
	
	public static void main(String[] args) {
		SubarraySumEqualsK equalsK =  new SubarraySumEqualsK();
		int[] num = {1,1,1};
		int[] num1 = {1,2,3};
		System.out.println(equalsK.subarraySum(num, 2));
		System.out.println(equalsK.subarraySum(num1, 3));
		System.out.println(-1 -0) ;
	}
	 public int subarraySum(int[] nums, int k) {
	       
	        int length = 0;
	        for(int i = 0; i < nums.length; i++){
	           int sum = nums[i];
	           if(sum == k) {
        		   length++;
        		   break;
        	   }
	           for(int j = i + 1; j < nums.length; j++) {
	        	   sum += nums[j];
	        	   if(sum == k) {
	        		   length++;
	        		   break;
	        	   }
	           }

	        }
	        return length;
	    }
}
