package com.test;

class Base {
	private int i;
	public Base(int i) {
		this.i = i;
		System.out.println("Base");
	}

}

class Child extends Base{
	public Child(int i) {
		super(i);
		System.out.println("Child");
	}
}

public class Inheritance{
	public static void main(String[] args) {
		Base base = new Child(10);
	}
}
