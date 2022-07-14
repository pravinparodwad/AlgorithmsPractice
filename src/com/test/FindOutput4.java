package com.test;

public class FindOutput4 {
	
	public void mathod() {
		try {
			int values[] = {1,2,3,4,3,2,1};
			for(int i = values.length-1; i>=0; i++) {
				System.out.println(values[i]+ "");
			}
		}catch(Exception e) {
			System.out.println("2"+"");
		}finally {
			System.out.println("1"+"");
		}
	}
	public static void main(String args[]) {
		FindOutput4 f = new FindOutput4();
		f.mathod();
	}

}

