
 package com.test;

import java.util.ArrayList;

/*
 * import java.util.HashSet; import java.util.Iterator;
 * 
 * public class FindOutput1 {
 * 
 * 
 * 
 * public static void main(String args[]) { String s1=new String("abc"); String
 * s2="abc"; String s4="ab" + new String("c"); System.out.println(s1==s2);
 * System.out.println(s4==s2); }
 * 
 * 
 * public static void main(String[] args) { char[] ch = {'a','b','c','d'};
 * String s = new String(ch); System.out.println(s); }
 * 
 * 
 * 
 * 
 * public static void main(String[] args) { HashSet<Integer> set=new
 * HashSet<Integer>(); set.add(5); set.add(null); set.add(5); set.add(2);
 * set.add(null); set.add(4); Iterator<Integer> itr=set.iterator();
 * while(itr.hasNext()){ System.out.print(itr.next()); } }
 * 
 * 
 * public static void main(String[] args)
 * 
 * {
 * 
 * A a1 = new A(); A a2 = new A(); A a3 = new A();
 * System.out.println(A.getInstanceCount()); }
 * 
 * 
 * }
 * 
 * class A
 * 
 * { private int counter = 0; public static int getInstanceCount() { return
 * counter; } public A() { counter++; } }
 * 
 * //This program outputs an error for variable i. As the scope of i is in if
 * block only. //uncomment else block to check the compilation error
 * 
 * 
 * 
 * class R { public int i; public int j; R() { i = 1; j = 2; } } class E extends
 * R { int a; E() { super(); } } class FindOutput1 { public static void
 * main(String args[]) { E obj = new E(); System.out.println(obj.i + " " +
 * obj.j); } }
 */


	/*
	 * class MyTest { static { initialize(); }
	 * 
	 * private static int sum;
	 * 
	 * public static int getSum() { initialize(); return sum; }
	 * 
	 * private static boolean initialized = false;
	 * 
	 * private static void initialize() { if (!initialized) { for (int i = 0; i <
	 * 100; i++) sum += i; initialized = true; } } }
	 * 
	 * public class FindOutput1 { public static void main(String[] args) {
	 * System.out.println(MyTest.getSum()); } }
	 */
 
 
	/*
	 * class X { protected int i = 1221;
	 * 
	 * void methodOfX() { System.out.println(i); } }
	 * 
	 * public class FindOutput1 { public static void main(String[] args) { X x = new
	 * X();
	 * 
	 * System.out.println(x.i);
	 * 
	 * x.methodOfX(); } }
	 */
 class FindOutput1{
 public static void main(String [] args)
 {
     ArrayList<String> list=new ArrayList<String>();
     StringBuffer s1 = new StringBuffer();
     int i=0;
     list.add("Test1");
     list.add("Test2");
     for (String s:list)
     {  
         list.add("Test"+i);
    	 //System.out.println("Test"+i); //Here Test+i will be concatenated even if the are string and int types. 
         i++;
         System.out.println(list);
     }
 }
 
 }