package com.test;

public class ReverseString {
	
	public String reverseString(String stringToReverse) {
		String reverseString = "";
		char ch;
		for(int i = 0 ; i <= stringToReverse.length()-1 ; i++) {
			ch = stringToReverse.charAt(i);
			reverseString = ch+reverseString;
		}
		
		return reverseString;
	}

	public static void main(String[] args) {
		ReverseString s = new ReverseString();
		
		System.out.println(s.reverseString("Automation"));
	}

}
