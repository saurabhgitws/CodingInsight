package com.gog.strings;

import java.util.Stack;
import java.util.regex.Pattern;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "i.like.this.program.very.much";
	    System.out.println(reverseWords(S));			
	}
	
	static String reverseWords(String S)
    {
        // code here 
        Stack<String> stack = new Stack<String>();
        String []str  = S.split(Pattern.quote("."));
        for(int i=0;i<str.length;i++){
            stack.add(str[i]);
        }
        String out=stack.pop();
        while(!stack.isEmpty()){
            out =out+"."+stack.pop();
        }
        
        return out;
        
        
    }

}
/*

there are 12 characters with special meanings: the backslash \, t
he caret ^, the dollar sign $, 
the period or dot ., 
the vertical bar or pipe symbol |, 
the question mark ?, the asterisk or star *, 
the plus sign +, the opening parenthesis (, the closing parenthesis ), 
and the opening square bracket [, the opening curly brace {, 
These special characters are often called "metacharacters".

So, if you want to split on e.g. period/dot . 
which means "any character" in regex, use either backslash \ to escape the 
individual special character like so split("\\."), or use character class [] to 
represent literal character(s) like so split("[.]"), or use Pattern#quote() to 
escape the entire string like so split(Pattern.quote(".")).
*/
