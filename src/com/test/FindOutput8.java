package com.test;

public class FindOutput8 {
		public static void main(String args[]) {
			
			String s1 = new String("Pravin");
			String s2 = "Pravin";
			String s3 = "Pravin";
			System.out.println(s1==s2);
			System.out.println(s3==s2);
			
			Integer i1 = new Integer(10);
			Integer i2 = new Integer(10);
			
			System.out.println(i1.equals(i2));
			System.out.println(i1==i2);
			
			Object o1 = new Object();
			Object o2 = new Object();
			
			System.out.println(o1.equals(o2));
			System.out.println(o1==o2);
			
		}
		
		

}

