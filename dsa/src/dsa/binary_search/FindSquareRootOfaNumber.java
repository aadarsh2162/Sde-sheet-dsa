package dsa.binary_search;

/*
   time com = O(logN)
   spcae  com = O(1)

 */

public class FindSquareRootOfaNumber {
	public static void main(String[] args) {
		long n = 25;
		System.out.println(floorSqrt(n));

	}

	public static long floorSqrt(long n) {
		long low = 1;
		long high = n;
		long ans = 0;

		while (low <= high) {
			long mid = (low + high) / 2;

			if ((mid * mid) <= n) {
				ans = mid;
				low = mid + 1;
			} else
				high = mid - 1;

		}
		return ans;
	}

}
