package com.test;


class A{
	public String getRessult(char a, char b) {
		return ("A");
	}
}

class B extends A{
	public String getRessult(char a, char b) {
		//super.super.getRessult(a, b);
		return ("B");
	}
}

public 
class Inheritance1 {

	public 
	static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println("Output1 : "+b.getRessult('a', 'a'));
		
		A a = new A();
		System.out.println("Output1 : "+a.getRessult('a', 'a'));

	}

}
