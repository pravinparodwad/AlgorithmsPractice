package com.test;

public class MathExceptions1 {
	
	public static void main(String args[]) {
		try {
			//int x = null; // This is type mismatch. null is used only for objects or reference not to primitive variabiles
			
			int a = 0;
			int ans = 5/a;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * catch (ArithmeticException ae) { ae.printStackTrace(); }
		*/
		}
	}
	
// tHis will throw exception saying the code is unreachable. Exception class is a parent of all exceptions
// in hierarchy, Exception will handle the exception thrown by the statement 5/a, so ther is no use of catching Arithmetic exception.