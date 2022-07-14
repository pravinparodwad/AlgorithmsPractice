package com.test;

class SingletonDemo1 {

	public static SingletonDemo1 sd;
	private SingletonDemo1() {
		
	}
	public static SingletonDemo1 getInstance() {
		if(sd != null) {
			sd = new SingletonDemo1();
		}
		return sd;
	}
}

 public class SingletonDemo{
	
	public static void main(String[] args) {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		
		if(s1 == s2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
	
}
