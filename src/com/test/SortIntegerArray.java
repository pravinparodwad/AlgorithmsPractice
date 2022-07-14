package com.test;

import java.util.Arrays;

public class SortIntegerArray {

	public static void main(String[] args) {
		int[] a = {4,8,9,5,2,3};
		SortIntegerArray s = new SortIntegerArray();
		System.out.println(Arrays.toString(a));
		s.sortArray(a);
	}

	public void sortArray(int[] a) {
		
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
