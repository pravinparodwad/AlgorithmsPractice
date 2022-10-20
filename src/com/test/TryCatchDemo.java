package com.test;

public class TryCatchDemo {

	public static void main(String[] args) {
		TryCatchDemo tcd = new TryCatchDemo();
		System.out.println(tcd.show());
	}
	
	public int show() {
		try {
			System.out.println("in try");
			return (10);
		}catch(Exception e) {
			System.out.println("in catch");
			return (20);
		} /*
			 * finally { System.out.println("in finally"); return (30); }
			 */
	}

}
