package com.test;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthLastWord("This is Pravin Parodwad"));
	}

	private static int lengthLastWord(String string) {
		String tokens[] = {};
		string = string.trim();
		if(string.equals("")) {
			return 0;
		}
		tokens = string.split("\\s+");
		return tokens[tokens.length-1].length();
	}

}
