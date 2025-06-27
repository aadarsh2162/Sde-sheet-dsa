package dsa.binary_search;

import java.util.Arrays;

public class FirstAndLastPositionofElementInSortedArray {
   public static void main(String[] args) {
	 int[] nums = {5,7,7,8,8,10};
	 int target = 8;
	 System.out.println("first and last postion is "+Arrays.toString(searchRange(nums, target)));
   }
   
   public static int[] searchRange(int[] nums, int target) {
       
       
       int low = 0;
       int high = nums.length -1;

        int first = firstTime(nums,target,low,high );      


       if(first == -1) return new int[] {-1,-1};
       int last = lastTime(nums,target , low,high);

       return new int[]{first , last};
       


   }

 public static int firstTime(int[] nums , int target , int low , int high){
         int first = -1;
          while(low <= high){
           int mid = (low + high) / 2;

           if(nums[mid] == target){
               first = mid;
               high = mid - 1;
           }
           else if(nums[mid] > target){
               high = mid - 1;
           }
           else low = mid + 1;
       }
       return first;

 }

   public static int lastTime(int[] nums , int target , int low , int high){
         int last = -1;
          while(low <= high){
           int mid = (low + high) / 2;

           if(nums[mid] == target){
               last = mid;
               low = mid + 1;
           }
           else if(nums[mid] > target){
               high = mid - 1;
           }
           else low = mid + 1;
       }
       return last;

 }
}
