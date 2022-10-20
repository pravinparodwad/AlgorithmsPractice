package com.test;

public class ReverseInteger {
	
	public static int reverse (int x) {
		long res = 0;
        while (x != 0) {
            res = res * 10;
            res = res + x % 10;
            x = x / 10;
        }
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
	}

	public static void main(String[] args) {
//		System.out.println(reverse(445567546));
		ReverseInteger ri = new ReverseInteger();
		ri.reverseInt(12345);
	}
	
	
	public void reverseInt(int number) {
		int temp = -1;
		int reverse = 0;
		while(number != 0) {
			temp = number % 10;
			reverse = reverse * 10 + temp;
			number = number / 10;
			temp = -1;
		}
		System.out.println(reverse);
	}

}
