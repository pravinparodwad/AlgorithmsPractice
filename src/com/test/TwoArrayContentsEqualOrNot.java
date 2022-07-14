package com.test;

public class TwoArrayContentsEqualOrNot {

	public static void main(String[] args) {
		String[] word1 = {"a", "bc"};
		String[] word2 = {"ab", "c"};
		
		System.out.println(checkArrayEqualOrNot(word1, word2));
	}

	private static boolean checkArrayEqualOrNot(String[] word1, String[] word2) {
		String w1 = "";
		String w2 = "";
		for(String temp : word1) {
			w1 = w1+temp;
		}
		for(String temp : word2) {
			w2 = w2+temp;
		}
		return w1.equals(w2);
	}

}
