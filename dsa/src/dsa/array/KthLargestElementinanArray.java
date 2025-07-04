package dsa.array;

import java.util.PriorityQueue;

public class KthLargestElementinanArray {
	public static void main(String[] args) {
		KthLargestElementinanArray array = new KthLargestElementinanArray();
		int[] num = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		System.out.println(array.findKthLargest(num, k));
	}

	public int findKthLargest(int[] nums, int k) {
		int kth = 0;
		int n = nums.length;
		int ele = 0;
		int count = 0;
//
//		for (int i = 0; i < n; i++) {
//			ele = nums[i]; 
//			
//			for (int j = 0; j < n; j++) {
//				if (ele < nums[j]) 
//					count++;
//
//			}
//			if (count < k) { 
//				kth = ele; 
//			}
//			if (count == k - 1)
//				return ele;
//			count = 0;
//		}
//
//		return ele;
		
		
//		PriorityQueue<Integer> k1 = new PriorityQueue<Integer>((o1,o2)-> o2.compareTo(o1));
	
// my soulution
//		for(int i =0; i < n; i++) {
//			k1.add(nums[i]);
//		}
//		while(k  > 0) {
//			 ele = k1.poll();
//			  k--;
//		}
//		
//		return ele;
//		
		
		PriorityQueue<Integer>   minHeap = new PriorityQueue<Integer>();
		
		
		for(int i : nums) {
			minHeap.add(i);
			if(minHeap.size() > k) minHeap.poll();
			
		}
		
		return minHeap.peek();
		
	}
}
