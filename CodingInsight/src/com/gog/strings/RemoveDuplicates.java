package com.gog.strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S="gfg";
		System.out.println(removeDups(S));
		
	}
	
	static String removeDups(String S) {
        // code here
		String out="";
		for(int i=0;i<S.length();i++) {
			
			if(!out.contains(String.valueOf(S.charAt(i)))) {
				out =out+String.valueOf(S.charAt(i));
			}
		}
		return out;
    }

}
