package com.test;

public class FactorialOfNumber {
		public static void main(String args[]) {
			int num = 7;
			long factorial = 1;
			for(int i=1; i<=num;i++) {
				factorial *=i;
			}
			System.out.println("Factorial is = "+factorial);
		}

}

