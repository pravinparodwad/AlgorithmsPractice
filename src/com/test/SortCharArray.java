package com.test;

import java.util.Arrays;

public class SortCharArray {

	public static void main(String[] args) {
		char[] ch = new char[] {'A','Q','S','Z','P'};
		System.out.println("array before sorting");
		System.out.println(new String(ch));
		SortCharArray s = new SortCharArray();
		s.sortCharArray(ch);
	}

	private void sortCharArray(char[] ch) {
		for(int i = 0;i<ch.length;i++) {
			for(int j = i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println("array after sorting");
		System.out.println(new String(ch));
	}

}
