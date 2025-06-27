package dsa.string;

public class ValidPalindromeII {
	
	public static void main(String[] args) {
		String s1 = "aba";
		String s2 = "abca";
		String s3 = "abc";
		
		
		ValidPalindromeII ii = new ValidPalindromeII();
		System.out.println(ii.validPalindrome(s1));
		System.out.println(ii.validPalindrome(s2));
		System.out.println(ii.validPalindrome(s3));
		
		System.out.println("flow".indexOf("flow"));
		
	}
	
	
	 public boolean validPalindrome(String s) {
		 
		 int left = 0; 
		 int right = s.length() - 1;
		 
		  while(left < right) {
			  
			  if(s.charAt(left) == s.charAt(right)) {
				  left++;
				  right--;
			  }
			  else {
				  return isValid(s, left + 1, right) || isValid(s,left,right -1 );
			  }
		  }
		  return true;
	        
	    }
	 
	 public boolean isValid(String s , int left,int right) {
		 while(left < right) {
			  if(s.charAt(left) == s.charAt(right)) {
				  left++;
				  right--;
			  }
			  else return false;
		 }
		 return true;
		 
	 }

}
