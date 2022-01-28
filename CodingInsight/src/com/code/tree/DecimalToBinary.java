package com.code.tree;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void toBinary(int num) {
		int binary[] = new int[35];
		int id=0;
		int count =0;
		while(num>0) {
			binary[id++]= num%2;
			num = num/2;
			count++;
		}
		
		
	}

}
