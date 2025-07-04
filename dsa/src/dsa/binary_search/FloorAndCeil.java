package dsa.binary_search;

public class FloorAndCeil {
	 public static int[] getFloorAndCeil(int[] arr, int n, int x) {
	        int f = findFloor(arr, n, x);
	        int c = findCeil(arr, n, x);
	        return new int[] {f, c};
	    }
	    public static void main(String[] args) {
	        int[] arr = {3, 4, 4, 7, 8, 10};
	        int n = 6, x = 5;
	        int[] ans = getFloorAndCeil(arr, n, x);
	        System.out.println("The floor and ceil are: " + ans[0]
	                           + " " + ans[1]);
	    }
	    
	    
	    static int findFloor(int[] arr , int n ,  int target) {
	    	
	    	int low = 0;
	    	int high = n -1;
	    	int ans = n;
	    	while(low <= high) {
	    		int mid = (low + high) / 2;
	    		
	    		
	    		if(arr[mid] <= target) {
	    			ans = arr[mid];
	    			low = mid + 1;
	    		}
	    		else high = mid -1;
	    	}
	    	return ans;
	    	
	    }
	    
        static int findCeil(int[] arr , int n ,  int target) {
        	int low = 0;
	    	int high = n -1;
	    	int ans = n;
	    	while(low <= high) {
	    		int mid = (low + high) / 2;
	    		
	    		
	    		if(arr[mid] >= target) {
	    			ans = arr[mid];
	    			high = mid - 1;
	    		}
	    		else 
low = mid  +1;
	    	}
	    	return ans;
	    	
	    }
}
