package com.gog.problem;

public class MajorityElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;
 
        // Function calling
        System.out.println(findMajority(arr, n));
	}

	static int findMajority(int arr[], int n) {
		int max=0;
		int count=0;

		for(int i=0;i<n;i++) {
			count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(max<count) {
				max=count;
			}
		}
		
		return max;
	}
}
