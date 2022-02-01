package com.leetcode.problem;

import java.util.PriorityQueue;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {100,4,200,1,3,2};
		int nums2[] = {0,3,7,2,5,8,4,6,0,1};
		
		System.out.println(longestConsecutive(nums2));
	}
    public static int longestConsecutive(int[] nums) {
        
    	PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    	
    	for(int i=0;i<nums.length;i++) {
    		priorityQueue.add(nums[i]);
    	}
    	
    	int prev = priorityQueue.poll();
    	
    	int count =1;
    	int max =1;
    	
    	for(int i=1;i<nums.length;i++) {
    		
    		// Case one if diff >1
    		if(priorityQueue.peek()-prev>1) {
    			count=1;
    			prev = priorityQueue.poll();
    		}else if (priorityQueue.peek()-prev==0) {
    			prev = priorityQueue.poll();
    		}else if(priorityQueue.peek()-prev==1) {
    			count++;
    			prev = priorityQueue.poll();
    		}
    		
    		if(count>max)
    			max = count;
    		
    	}
    			
    	
    	return max;
    }
}
