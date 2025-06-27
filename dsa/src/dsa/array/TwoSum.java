package dsa.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
public static void main(String[] args) {
	 int[] nums = {2,7,11,15};
			 int target = 9;
		System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));	 
			 
}

public int[] twoSum(int[] nums, int target) {
	
	
  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  
  for(int i =0; i < nums.length; i++) {
	  int a = nums[i];
	  int remain = target - a;
	  
	  if(map.containsKey(remain)) {
		  return new int[] {map.get(remain) , i};
	  }
	  map.put(a,i);
  }
  return new int[] {};
    
}
}
