package com.leetcode.problem;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr [] = {2,5,9,6,9,3,8,9,7,1};
		 System.out.println(findDuplicateNumber(arr));
	}
	
	public static int findDuplicateNumber(int arr[]) {
		int slow =arr[0];
		int fast = arr[0];
		
		do{
			slow = arr[slow];
			fast = arr[arr[fast]];
		}while(slow!=fast) ;
		
		slow=arr[0];
		while(slow!=fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		
		return slow;
	}

}
