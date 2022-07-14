package com.test;

public class ReplacePureWords {
	public static void main (String args[]) {
		String s = "Let's meet l8r 2nite?";
		System.out.println(replacePureWord(s));
	}
	public static String replacePureWord(String test) {
		int len=test.length();

		StringBuilder outputString = new StringBuilder();
		for (int i = 0; i < len; i++) {
			if(!(Character.isLetter(test.charAt(i)))) {
				outputString.append("*");
				outputString.append(test.charAt(i));
			}
		}
		return outputString.toString();
	}
}

