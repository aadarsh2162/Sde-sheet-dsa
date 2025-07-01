package dsa.binary_search;

public class SQRT {
	 public static int mySqrt(int x) {
	        int low = 1;
	        int high = x;
	        int ans = 0;

	        while (low <= high) {
	            int mid = low + (high - low) / 2; 
	            long square = (long) mid * mid;

	            if (square <= x) {
	                ans = mid;
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		System.out.println(mySqrt(10));
	}

}
