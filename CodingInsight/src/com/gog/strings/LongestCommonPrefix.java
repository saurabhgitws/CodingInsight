package com.gog.strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"geeksforgeeks", "geeks", "geek",
		         "geezer"};
		
		String arr1[] = {"hello", "world"};
		System.out.println(longestCommonPrefix(arr1, arr1.length));

	}
	
	static String longestCommonPrefix(String arr[], int n){
        // code here
		String prefix="";
		int count =0; 
		
			for(int j=0;j<arr[0].length();j++ ) {
				count =1;
				for(int k=1;k<n;k++) {
					if(j< arr[k].length()) {
					  if(arr[0].charAt(j)==arr[k].charAt(j)) {
					   	  count++;
					  }
					}else {
						
					}
				}
				if(count == n) {
					prefix = prefix+arr[0].charAt(j);
				}
			}
		
		return prefix;
    }

}
