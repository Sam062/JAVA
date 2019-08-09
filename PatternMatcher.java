package com.app;

public class PatternMatcher {
	public static void main(String[] args) {
		String s="a b c";
		char[] c=s.toCharArray();
		int charcount=0;
		int digcount=0;
		
		/*for(char i:c) {
			System.out.println(i+" ");
		}
		System.out.println();*/
		for(int i:c) {
			if(i>=48 && i<=57) {
				digcount++;
			}
			else if(i>65 && i<=123) {
				charcount++;
			}
		}
		System.out.println("No of digits="+digcount);
		System.out.println("No of char="+charcount);
		
	}

}
