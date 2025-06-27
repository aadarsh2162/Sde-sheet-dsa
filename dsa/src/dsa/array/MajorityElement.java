package dsa.array;

import java.util.Arrays;

public class MajorityElement {
	public static void main(String[] args) {
		MajorityElement element = new MajorityElement();
		int[] num1 = {6,6,6,7,7};
		System.out.println(element.majorityElement(num1));
	}
   public int majorityElement(int[] nums) {
	   
      int count = 0;
       int ele = 0;
       int n = nums.length;
       if(n == 1) return nums[0];
       for(int i = 0; i < n - 1; i++) {
    	   if(count == 0) {
    		   count = 1;
    		   ele = nums[i];
    	   }
    	   else if(ele == nums[i]) count++;
    	   else count--;
       }
       return ele;
   }

}
