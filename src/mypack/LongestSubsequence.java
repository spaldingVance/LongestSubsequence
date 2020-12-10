package mypack;

import java.util.Arrays; 

public class LongestSubsequence {

	
	static int maxLength;
	
	
	public static void main(String[] args) {
		int numArr[] = { 6, 7, 2, 3, 5, 4}; 
		
		
		System.out.println(Arrays.toString(numArr));
		int length = numArr.length;
		int result = findLongestSubsequence(numArr, length);
		System.out.println("The longest subsequence is of length: " + result );

	}
	
	static int findLongestSubsequence(int numArr[], int length) {
		System.out.println("Called");
		if (length == 1) {
			System.out.println("Length is 1, returning");
			return 1;
		}
		
		int previousMaxLength = 1;
		for(int i = 1; i < length; i++) {
			int currentMaxLength = findLongestSubsequence(numArr, i);
			
			if (numArr[i-1] < numArr[length-1] && currentMaxLength + 1 > previousMaxLength) {
				
                previousMaxLength = currentMaxLength + 1; 
            }
			
		}
		if (maxLength < previousMaxLength) {
			maxLength = previousMaxLength; 
		}

	        return previousMaxLength; 
	}

}
