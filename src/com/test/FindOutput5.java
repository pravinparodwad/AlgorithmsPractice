package com.test;

class C{
	public int x = 1;
	public C(int i) {
		x+=i;
	}
}

class D extends C{
	public D(int i) {
		super(i);
		x+=i;
	}
}

public class FindOutput5 {
		public static void main(String args[]) {
			C ar[] = new C[2];
			ar[0] = new C(1);
			ar[1] = new D(2);
			System.out.println(ar[0].x + ar[1].x);
	}

}

