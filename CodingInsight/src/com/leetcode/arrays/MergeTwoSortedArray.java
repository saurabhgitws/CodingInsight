package com.leetcode.arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2 []= {2,5,6};
	    int n = 3;
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}
	
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int num[] = new int [m+n];
        int i=0;
        int j=0;
        int k=0;
        while(j<m && k<n){
            if(nums1[j] < nums2[k]){
                num[i++]=nums1[j++];
            }else{
                num[i++]=nums2[k++];
            }
        }
        
        while(j<m){
            num[i++]=nums1[j++];
        }
         while(k<n){
            num[i++]=nums2[k++];
        }
        
        for(int l=0;l<i;l++){
            nums1[l] = num[l];
        }
    }

}
