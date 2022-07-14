package com.test;

public class NoOfSegments {

	public static void main(String[] args) {
		String s ="    foo    bar";
		NoOfSegments nos = new NoOfSegments();
		System.out.println(nos.findSegments(s));
	}

	private int findSegments(String test) {
		test = test.trim();
		if(!(test.equals(""))) { 
			return test.split("\\s+").length;
		}
		return 0;

		/*
		 * String tokens = test.trim(); if (tokens.equals("")) { return 0; } return
		 * tokens.split("\\s+").length;
		 */
	}

}
