package com.test;

public class FindOutput2 {
	public static int calculate(int n) {
		if(n == 1) {
			return 0;
		}
		else {
			return (1+ calculate(n/2));
		}
	}
	public static void main(String args[]) {
		int x = calculate (16);
		System.out.println("x is = "+x);
	}

}

// return (1+ calculate(n/2)) step will be placed in stack and only call to calculate method will be given untill n machtes to 1
//in the above example, after first return statement is invoked, all the calls in stack are popped up
//as the method is called 4 times, 1 is added with itself 4 times, hence the output is 4
