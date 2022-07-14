package com.test;

public class TestDemo{
	public static void main(String []args) throws Exception {
		try {
			badMethod();
			assert false;
			int x = 3;
			if(x == 2) {
				x=0;
			}if(x == 3) {
				x++;
			}
			else {
				x+=2;
			}
			
			System.out.print(x);
		}catch (Error e) {
			System.out.print("c ");
			throw new Exception();
		}finally {
			System.out.print("f ");
		}
	}
	
	public static void badMethod() {}
}
