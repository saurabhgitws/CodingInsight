package com.leetcode.problem;

public class BestTimeBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int prices []= {7,1,5,3,6,4};
		int prices []= {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}
	
    public static  int maxProfit2(int[] prices) {
    	int MaxProfit =0;
    	for(int i=0;i<prices.length;i++) {
    	   for(int j=i+1;j<prices.length;j++) {
    		   if(prices[j]-prices[i]>MaxProfit) {
    			   MaxProfit =prices[j]-prices[i];
    		   }
    	   }	
    	}
    	
    	if(MaxProfit>0)
    		return MaxProfit;
        return 0;
    }

    
    public static  int maxProfit(int[] prices) {
    	int MaxProfit =0;
    	int MinPrice = Integer.MAX_VALUE;
    	for(int i=0;i<prices.length;i++) {
    	   if(prices[i]<MinPrice)
    		   MinPrice = prices[i];
    	   else if (prices[i]-MinPrice> MaxProfit)
    		   MaxProfit = prices[i]-MinPrice;
    	}
    	
    	
        return MaxProfit;
    }
}
