package com.leetcode.problem;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf2(nums)));
	}

	
	public static int[] productExceptSelf(int[] nums) {
	    int result[] = new int[nums.length];
	    result[nums.length-1]= 1;
	    for(int i = nums.length-2;i>=0;i--) {
	    	result[i] = result[i+1]*nums[i+1];
	    }
	    
	    int left =1;
	    for(int i=0;i<nums.length;i++) {
	    	result[i] = result[i]*left;
	    	left = left*nums[i];
	    }
	    
	    return result;
	}
	
	
	public static int[] productExceptSelf1(int[] nums) {
	    int result[] = new int[nums.length];
	    for(int i=0;i<nums.length;i++) {
	    	int mul=1;
	    	for(int j=0;j<nums.length;j++) {
	    		if(i==j)continue;
	    		mul=mul*nums[j];
	    	}
	    	
	    	result[i] =mul;
	    }
	    
	    return result;
	}
	
	
	public static int[] productExceptSelf2(int[] nums) {
	    int result[] = new int[nums.length];
	    int left[] = new int[nums.length];
	    int right[] = new int[nums.length];
	    left[0]=1;
	    		
	    for(int i=0;i<nums.length-1;i++) {
	    	left[i+1]=left[i]*nums[i];
	    	
	    }
	    System.out.println(Arrays.toString(left));
	    right[nums.length-1]=1;
	    for(int i=nums.length-1;i>0;i--) {
	    	right[i-1]=right[i]*nums[i];
	    }
	    System.out.println(Arrays.toString(right));
	    for(int i=0;i<nums.length;i++) {
	    	result[i]= left[i]*right[i];
	    }
	    return result;
	}
}
