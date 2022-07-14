package com.test;

public class FindOutput3 {
	public static int method(int a, int b) {
		return (a+b);
	}
	
	public static String method(String a, String b) {
		return (a+b);
	}
	
	public static void main(String args[]) {
		String s = method("0", "100");
		//String s = method(1,100);
		System.out.println(s);
	}

}

