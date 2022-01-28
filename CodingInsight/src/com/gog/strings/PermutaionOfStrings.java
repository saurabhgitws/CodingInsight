package com.gog.strings;

import java.util.ArrayList;
import java.util.List;


public class PermutaionOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="ABC";
		for(String s:find_permutation(S)) {
			System.out.println(s);
		}

	}
	
	static public  List<String> find_permutation(String S) {
        // Code here
		List<String> outList = new ArrayList<String>();
		permute(S, 0, S.length()-1,outList );
		return outList;
    }
	
	
	static private void permute(String S,int idx,int N,List<String> outList) {
		if(idx==N) {
			//System.out.println(S);
			outList.add(S);
		}else {
			for(int i=idx;i<=N;i++) {
				S=swap(S, idx, i);
				permute(S, idx+1, N, outList);
				S=swap(S, idx, i);
			}
		}
	}
	static private String swap(String S,int i,int j) {
		char charArray[] =S.toCharArray();
		
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
		return String.valueOf(charArray);
	}

}
