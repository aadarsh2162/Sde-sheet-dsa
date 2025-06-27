package dsa.array;


public class CheckifArrayIsSortedandRotated {
	public static void main(String[] args) {
		CheckifArrayIsSortedandRotated obj = new CheckifArrayIsSortedandRotated();
		int[] nums = {3,4,5,1,2};
		System.out.println(obj.check(nums));
		
	}
		public boolean check(int[] nums) {
			 int count = 0;
			    for (int i = 0; i < nums.length; i++) {
			        int next = nums[(i + 1) % nums.length]; // wrap around
			        if (nums[i] > next) {
			            count++;
			        }
			    }
			    return count <= 1;
		}
}
