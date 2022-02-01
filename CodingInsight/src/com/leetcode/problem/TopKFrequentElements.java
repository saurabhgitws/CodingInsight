package com.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,1,1,2,2,3}, k = 2;
		System.out.println(Arrays.toString(topKFrequent(nums, k)));
	}
	
	public static int[] topKFrequent(int[] nums, int k) {
      int out [] = new int [k];
      HashMap<Integer, Integer> map = new HashMap <Integer, Integer>();
      
      for(int i=0;i<nums.length;i++) {
    	  if(map.containsKey(nums[i])) {
    		  map.put(nums[i], map.get(nums[i])+1);
    	  }else {
    		  map.put(nums[i], 1);
    	  }
      }
      
      Comparator<Map.Entry<Integer,Integer>> comprator = new Comparator<Map.Entry<Integer,Integer>>() {

		@Override
		public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
			// TODO Auto-generated method stub
			if(o1.getValue() < o2.getValue()) return 1;
			else 
				return -1;
			
		}
	   
      };
      
      
      PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(comprator);
      
      for(Map.Entry<Integer, Integer> val : map.entrySet()) {
    	  priorityQueue.add(val);
      }
      
      int i=0;
      while(i<k) {
    	  Map.Entry<Integer, Integer> data = priorityQueue.poll();
    	  out[i++] = data.getKey();
      }
      
      return out;
      
	}
}
